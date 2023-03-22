import grpc.*;
import io.grpc.stub.StreamObserver;
import grpc.EnrolmentServiceGrpc.EnrolmentServiceBlockingStub;

public class EnrollmentService extends EnrolmentServiceGrpc.EnrolmentServiceImplBase {

  public EnrollmentService() {
  }

  @Override
  public void getAllStudentData(Empty request, StreamObserver<getAllStudentDataResponse> responseObserver) {
    super.getAllStudentData(request, responseObserver);
  }

  @Override
  public void getAllCourseData(Empty request, StreamObserver<getAllCourseDataResponse> responseObserver) {
    super.getAllCourseData(request, responseObserver);
  }

  @Override
  public void addStudent(addStudentRequest requestParm, StreamObserver<addStudentResponse> responseObserver) {
    super.addStudent(requestParm, responseObserver);
  }

  @Override
  public void deleteStudent(deleteStudentRequest request, StreamObserver<deleteStudentResponse> responseObserver) {
    super.deleteStudent(request, responseObserver);
  }

  @Override
  public void addCourse(addCourseRequest request, StreamObserver<addCourseResponse> responseObserver) {
    super.addCourse(request, responseObserver);
  }

  @Override
  public void deleteCourse(deleteCourseRequest request, StreamObserver<deleteCourseResponse> responseObserver) {
    super.deleteCourse(request, responseObserver);
  }

  @Override
  public void isRegisteredStudent(isRegisteredStudentRequest request, StreamObserver<isRegisteredStudentResponse> responseObserver) {
    super.isRegisteredStudent(request, responseObserver);
  }

  @Override
  public void isRegisteredCourse(isRegisteredCourseRequest request, StreamObserver<isRegisteredCourseResponse> responseObserver) {
    super.isRegisteredCourse(request, responseObserver);
  }

  @Override
  public void validateLogin(validateLoginRequest request, StreamObserver<validateLoginResponse> responseObserver) {
    super.validateLogin(request, responseObserver);
  }

  @Override
  public void addReservation(addReservationRequest request, StreamObserver<addReservationResponse> responseObserver) {
    super.addReservation(request, responseObserver);
  }
}
