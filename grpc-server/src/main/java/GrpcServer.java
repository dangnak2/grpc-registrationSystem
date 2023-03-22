import grpc.EnrolmentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {

  public static void main(String[] args) throws IOException, InterruptedException {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
    EnrolmentServiceGrpc.EnrolmentServiceBlockingStub stub = EnrolmentServiceGrpc.newBlockingStub(channel);

    Server server = ServerBuilder.forPort(5054).addService(new EnrollmentService(stub)).build();
    server.start();
    System.out.println("Server's ready!");
    server.awaitTermination();
  }
}
