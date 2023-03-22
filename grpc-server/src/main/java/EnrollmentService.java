import grpc.*;
import io.grpc.stub.StreamObserver;
import grpc.EnrolmentServiceGrpc.EnrolmentServiceBlockingStub;

import java.util.ArrayList;

public class EnrollmentService extends EnrolmentServiceGrpc.EnrolmentServiceImplBase {

  EnrolmentServiceBlockingStub stub;

  public EnrollmentService(EnrolmentServiceBlockingStub stub) {
    this.stub = stub;
  }

  @Override
  public void getAllStudentData(Empty request, StreamObserver<getAllStudentDataResponse> responseObserver) {
    getAllStudentDataResponse dataSideResponse = stub.getAllStudentData(Empty.newBuilder().build());
    getAllStudentDataResponse serverSideResponse = getAllStudentDataResponse.newBuilder()
            .addAllStudent(dataSideResponse.getStudentList())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void getAllCourseData(Empty request, StreamObserver<getAllCourseDataResponse> responseObserver) {
    getAllCourseDataResponse dataSideResponse = stub.getAllCourseData(Empty.newBuilder().build());
    getAllCourseDataResponse serverSideResponse = getAllCourseDataResponse.newBuilder()
            .addAllCourse(dataSideResponse.getCourseList())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void addStudent(addStudentRequest request, StreamObserver<addStudentResponse> responseObserver) {
    addStudentResponse dataSideResponse = stub.addStudent(addStudentRequest.newBuilder()
            .setStudentId(request.getStudentId())
            .setStudentPw(request.getStudentPw())
            .setStudentName(request.getStudentName())
            .setStudentDpt(request.getStudentDpt())
            .setCompletedCourses(request.getCompletedCourses())
            .build());
    addStudentResponse serverSideResponse = addStudentResponse.newBuilder()
            .setSuccess(dataSideResponse.getSuccess())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void addCourse(addCourseRequest request, StreamObserver<addCourseResponse> responseObserver) {
    addCourseResponse dataSideResponse = stub.addCourse(addCourseRequest.newBuilder()
            .setCourseId(request.getCourseId())
            .setCourseName(request.getCourseName())
            .setProfessorName(request.getProfessorName())
            .setClassroomList(request.getClassroomList())
            .build());
    addCourseResponse serverSideResponse = addCourseResponse.newBuilder()
            .setSuccess(dataSideResponse.getSuccess())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteStudent(deleteStudentRequest request, StreamObserver<deleteStudentResponse> responseObserver) {
    deleteStudentResponse dataSideResponse = stub.deleteStudent(deleteStudentRequest.newBuilder()
            .setStudentId(request.getStudentId())
            .build());
    deleteStudentResponse serverSideResponse = deleteStudentResponse.newBuilder()
            .setSuccess(dataSideResponse.getSuccess())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteCourse(deleteCourseRequest request, StreamObserver<deleteCourseResponse> responseObserver) {
    deleteCourseResponse dataSideResponse = stub.deleteCourse(deleteCourseRequest.newBuilder()
            .setCourseId(request.getCourseId())
            .build());
    deleteCourseResponse serverSideResponse = deleteCourseResponse.newBuilder()
            .setSuccess(dataSideResponse.getSuccess())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void isRegisteredStudent(isRegisteredStudentRequest request, StreamObserver<isRegisteredStudentResponse> responseObserver) {
    isRegisteredStudentResponse serverSideResponse;

    isRegisteredStudentResponse dataSideResponse = stub.isRegisteredStudent(isRegisteredStudentRequest.newBuilder()
            .setStudentId(request.getStudentId())
            .build());
    if (dataSideResponse.getStatus().equals("NOT_FOUNT_STUDENT")) {
      try {
        throw new NotFoundDataException("존재하지 않는 학생 데이터로 인해 발생한 오류입니다.");
      } catch (NotFoundDataException e) {
        e.printStackTrace();
      }
      serverSideResponse = isRegisteredStudentResponse.newBuilder()
              .setStatus(dataSideResponse.getStatus())
              .build();
    } else {
      serverSideResponse = isRegisteredStudentResponse.newBuilder()
              .setStudent(dataSideResponse.getStudent())
              .build();
    }
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void isRegisteredCourse(isRegisteredCourseRequest request, StreamObserver<isRegisteredCourseResponse> responseObserver) {
    isRegisteredCourseResponse dataSideResponse = stub.isRegisteredCourse(isRegisteredCourseRequest.newBuilder()
            .setCourseId(request.getCourseId())
            .build());
    isRegisteredCourseResponse serverSideResponse = isRegisteredCourseResponse.newBuilder()
            .setCourse(dataSideResponse.getCourse())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void validateLogin(validateLoginRequest request, StreamObserver<validateLoginResponse> responseObserver) {
    validateLoginResponse dataSideResponse = stub.validateLogin(validateLoginRequest.newBuilder()
            .setInputId(request.getInputId())
            .setInputPw(request.getInputPw())
            .build());
    validateLoginResponse serverSideResponse = validateLoginResponse.newBuilder()
            .setSuccess(dataSideResponse.getSuccess())
            .build();
    responseObserver.onNext(serverSideResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void addReservation(addReservationRequest request, StreamObserver<addReservationResponse> responseObserver) {
    int cnt = 0;
    isRegisteredStudentResponse response = stub.isRegisteredStudent(isRegisteredStudentRequest.newBuilder()
            .setStudentId(request.getStudentId())
            .build());
    Student reservationStu = response.getStudent();
    if (reservationStu != null) {
      validateCourse:
      for (String course : request.getCourseId().split(" ")) {
        Course registeredCourse = stub.isRegisteredCourse(isRegisteredCourseRequest.newBuilder().setCourseId(course).build()).getCourse();
        // 등록되어있는 course인지 check
        if (registeredCourse != null) {
          // 학생이 이미 수강한 과목인지 check
          if (!reservationStu.getCompletedCoursesList().contains(registeredCourse.getCourseId())) {
            // 선수과목을 이수했는지 check
            for (String c : registeredCourse.getClassroomListList()) {
              // 선수과목이 없다면 정상 등록된 강좌 +1
              if (c.equals("0")) {
                cnt++;
                continue validateCourse;
              } else if (!reservationStu.getCompletedCoursesList().contains(c))
                System.out.println("선수 과목 이수가 필요합니다. 다시 시도해주세요");
              break validateCourse;
            }
            // 선수 과목을 모두 수강했다면 정상 등록 강좌 + 1
            cnt++;
          } else System.out.println("이미 수강한 과목입니다. 다시 시도해주세요");
          break validateCourse;
        } else System.out.println("등록되어 있지 않은 강좌 id 입니다. 다시 시도해주세요.");
        break validateCourse;
      }
      String[] enrollmentCourses = request.getCourseId().split(" ");
      if (enrollmentCourses.length == cnt) {
        addReservationResponse dataSideResponse = stub.addReservation(addReservationRequest.newBuilder()
                .setStudentId(request.getStudentId())
                .setCourseId(request.getCourseId())
                .build());
        addReservationResponse serverSideResponse = addReservationResponse.newBuilder()
                .setSuccess(dataSideResponse.getSuccess())
                .build();
        responseObserver.onNext(serverSideResponse);
        responseObserver.onCompleted();
      } else throw new RuntimeException();
    } else System.out.println("등록되어 있지 않은 학생 id 입니다. 다시 시도해주세요.");

  }
}
