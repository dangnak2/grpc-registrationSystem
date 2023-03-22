package Main;

import DAO.course.CourseDAO;
import DAO.reservation.ReservationDAO;
import DAO.student.StudentDAO;
import grpc.EnrolmentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcData {
  public static void main(String[] args) throws IOException, InterruptedException {
    AppConfig appConfig = new AppConfig();
    StudentDAO studentDAO = appConfig.StudentDAO();
    CourseDAO courseDAO = appConfig.CourseDAO();
    ReservationDAO reservationDAO = appConfig.ReservationDAO();

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
    EnrolmentServiceGrpc.EnrolmentServiceBlockingStub stub = EnrolmentServiceGrpc.newBlockingStub(channel);
    Server server = ServerBuilder.forPort(50051).addService(new EnrollmentService(studentDAO, courseDAO, reservationDAO)).build();
    server.start();
    System.out.println("Data's ready!");
    server.awaitTermination();
  }
}
