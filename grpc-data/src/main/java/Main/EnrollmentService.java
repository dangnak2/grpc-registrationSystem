package Main;

import DAO.course.CourseDAO;
import DAO.reservation.ReservationDAO;
import DAO.student.StudentDAO;
import com.google.protobuf.NullValue;
import grpc.*;
import io.grpc.stub.StreamObserver;

import java.util.Collections;

public class EnrollmentService extends EnrolmentServiceGrpc.EnrolmentServiceImplBase {

  StudentDAO studentDAO;
  CourseDAO courseDAO;
  ReservationDAO reservationDAO;

  public EnrollmentService(StudentDAO studentDAO, CourseDAO courseDAO, ReservationDAO reservationDAO) {
    this.studentDAO = studentDAO;
    this.courseDAO = courseDAO;
    this.reservationDAO = reservationDAO;
  }


  @Override
  public void getAllStudentData(Empty request, StreamObserver<getAllStudentDataResponse> responseObserver) {
    getAllStudentDataResponse response = getAllStudentDataResponse.newBuilder()
            .addAllStudent(studentDAO.getStudentList())
            .build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getAllCourseData(Empty request, StreamObserver<getAllCourseDataResponse> responseObserver) {
    getAllCourseDataResponse response = getAllCourseDataResponse.newBuilder()
            .addAllCourse(courseDAO.getCourseList())
            .build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void addStudent(addStudentRequest request, StreamObserver<addStudentResponse> responseObserver) {
    addStudentResponse response;
    Student student = Student.newBuilder()
            .setStudentId(request.getStudentId())
            .setStudentPw(request.getStudentPw())
            .setStudentName(request.getStudentName())
            .setStudentDpt(request.getStudentDpt())
            .addAllCompletedCourses(Collections.singleton(request.getCompletedCourses()))
            .build();
    if (studentDAO.add(student)) {
      response = addStudentResponse.newBuilder()
              .setSuccess(true)
              .build();
    } else {
      response = addStudentResponse.newBuilder()
              .setSuccess(false)
              .build();
    }
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void addReservation(addReservationRequest request, StreamObserver<addReservationResponse> responseObserver) {
    addReservationResponse response;
    Reservation reservation = Reservation.newBuilder()
            .setStudentId(request.getStudentId())
            .setCourseId(request.getCourseId())
            .build();
    if (reservationDAO.add(reservation)) {
      response = addReservationResponse.newBuilder()
              .setSuccess(true)
              .build();
    } else {
      response = addReservationResponse.newBuilder()
              .setSuccess(false)
              .build();
    }
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void addCourse(addCourseRequest request, StreamObserver<addCourseResponse> responseObserver) {
    addCourseResponse response;
    Course course = Course.newBuilder()
            .setCourseId(request.getCourseId())
            .setCourseName(request.getCourseName())
            .setProfessorName(request.getProfessorName())
            .addAllClassroomList(Collections.singleton(request.getClassroomList()))
            .build();
    if (courseDAO.add(course)) {
      response = addCourseResponse.newBuilder()
              .setSuccess(true)
              .build();
    } else {
      response = addCourseResponse.newBuilder()
              .setSuccess(false)
              .build();
    }
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteStudent(deleteStudentRequest request, StreamObserver<deleteStudentResponse> responseObserver) {
    deleteStudentResponse response;
    if (studentDAO.delete(Integer.parseInt(request.getStudentId()))) {
      response = deleteStudentResponse.newBuilder()
              .setSuccess(true)
              .build();
    } else {
      response = deleteStudentResponse.newBuilder()
              .setSuccess(false)
              .build();
    }
    responseObserver.onNext(response);
    responseObserver.onCompleted();

  }

  @Override
  public void deleteCourse(deleteCourseRequest request, StreamObserver<deleteCourseResponse> responseObserver) {
    deleteCourseResponse response;
    if (courseDAO.delete(Integer.parseInt(request.getCourseId()))) {
      response = deleteCourseResponse.newBuilder()
              .setSuccess(true)
              .build();
    } else {
      response = deleteCourseResponse.newBuilder()
              .setSuccess(false)
              .build();
    }
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void isRegisteredStudent(isRegisteredStudentRequest request, StreamObserver<isRegisteredStudentResponse> responseObserver) {
    isRegisteredStudentResponse response;
    Student student = studentDAO.get(request.getStudentId());
    if (student != null) {
      response = isRegisteredStudentResponse.newBuilder()
              .setStudent(student)
              .build();
    } else {
      response = isRegisteredStudentResponse.newBuilder()
              .setStatus("NOT_FOUND_STUDENT")
              .build();
    }
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void isRegisteredCourse(isRegisteredCourseRequest request, StreamObserver<isRegisteredCourseResponse> responseObserver) {
    isRegisteredCourseResponse response;
    Course course;
    course = courseDAO.get(request.getCourseId());
    if (course != null) {
      response = isRegisteredCourseResponse.newBuilder()
              .setCourse(course)
              .build();
    } else {
      response = isRegisteredCourseResponse.newBuilder()
              .setStatus("NOT_FOUND_COURSE")
              .build();
    }
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void validateLogin(validateLoginRequest request, StreamObserver<validateLoginResponse> responseObserver) {
    validateLoginResponse response;
    Student loginStudent = studentDAO.get(request.getInputId());
    if (loginStudent != null) {
      if (request.getInputPw().equals(loginStudent.getStudentPw())) {
        response = validateLoginResponse.newBuilder()
                .setSuccess(Boolean.TRUE)
                .build();
      } else {
//        response = validateLoginResponse.newBuilder()
//                .setSuccess(Boolean.FALSE)
//                .build();
        response = validateLoginResponse.newBuilder()
                .build();
      }
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
  }
}
