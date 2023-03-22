import grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import grpc.EnrolmentServiceGrpc.EnrolmentServiceBlockingStub;

public class GrpcClient {
  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5054).usePlaintext().build();
    EnrolmentServiceBlockingStub stub = EnrolmentServiceGrpc.newBlockingStub(channel);

    BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    try {
      login:
      while (true) {
        System.out.println("-------------- 학사정보 프로그램 --------------");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        String loginChoice = userInput.readLine().trim();
        switch (loginChoice) {
          case "1":
            if (login(stub, userInput)) break;
            else System.out.println("아이디 또는 비밀번호를 잘못 입력하였습니다. 다시 시도해주세요.");
            continue login;
          case "2":
            join:
            while (true) {
              String addStudent = addStudent(stub, userInput);
              isRegisteredStudentResponse response = stub.isRegisteredStudent(isRegisteredStudentRequest.newBuilder().setStudentId(addStudent).build());
              Student registeredStudent = response.getStudent();
              System.out.println("회원가입을 축하합니다 " + registeredStudent.getStudentName() + " 님!");
              continue login;
            }
        }
        mainMenu:
        while (true) {
          showMenu();
          String menuChoice = userInput.readLine().trim();
          switch (menuChoice) {
            case "1":
              getAllStudentDataResponse studentDataRes = stub.getAllStudentData(Empty.newBuilder().build());
              for (Student student : studentDataRes.getStudentList()) System.out.println(student);
              break;
            case "2":
              getAllCourseDataResponse courseDataRes = stub.getAllCourseData(Empty.newBuilder().build());
              for (Course course : courseDataRes.getCourseList()) System.out.println(course);
              break;
            case "3":
              addStudent(stub, userInput);
              break;
            case "4":
              deleteStudent(stub, userInput);
              break;
            case "5":
              addCourse(stub, userInput);
              break;
            case "6":
              deleteCourse(stub, userInput);
              break;
            case "7":
              addReservation(stub, userInput);
              break;
            case "8":
              continue login;
            case "x":
              return;
            default:
              System.out.println("Invalid choice!");
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    channel.shutdown();
  }

//  private static void showList(ArrayList<?> dataList) {
//    String list = "";
//    for (int i = 0; i < dataList.size(); i++) {
//      list += dataList.get(i) + "\n";
//    }
//    System.out.println(list);
//  }

  private static boolean login(EnrolmentServiceBlockingStub stub, BufferedReader userInput) throws IOException {
    System.out.println("아이디 : ");
    String inputId;
    while (true) {
      inputId = userInput.readLine().trim();
      if (!inputId.matches("[+-]?\\d*(\\.\\d+)?")) {
        System.out.println("숫자만 입력해 주세요.");
        System.out.println("id : ");
      } else break;
    }
    System.out.println("비밀번호 : ");
    String inputPw = userInput.readLine().trim();
    validateLoginResponse response = stub.validateLogin(validateLoginRequest.newBuilder()
            .setInputId(inputId)
            .setInputPw(inputPw)
            .build());
    return response.getSuccess();
  }

  private static String addStudent(EnrolmentServiceBlockingStub stub, BufferedReader userInput) throws IOException {
    System.out.println("------------ 학생 정보 입력 ------------");
    String studentId;
    System.out.println("학생 ID : ");
    while (true) {
      studentId = userInput.readLine().trim();
      if (!studentId.matches("[+-]?\\d*(\\.\\d+)?")) {
        System.out.println("숫자만 입력해 주세요.");
      } else break;
    }
    System.out.println("학생 비밀번호 : ");
    String studentPw = userInput.readLine().trim();
    System.out.println("학생 이름 : ");
    String studentName = userInput.readLine().trim();
    System.out.println("학과 : ");
    String studentDept = userInput.readLine().trim();
    System.out.println("이수과목 : ");
    String completedCourses = userInput.readLine().trim();

    addStudentResponse response = stub.addStudent(addStudentRequest.newBuilder()
            .setStudentId(studentId)
            .setStudentPw(studentPw)
            .setStudentName(studentName)
            .setStudentDpt(studentDept)
            .setCompletedCourses(completedCourses)
            .build());
    if (response.getSuccess()) System.out.println("정상적으로 추가되었습니다!");
    else System.out.println("실패했습니다! 다시 시도해주세요...");
    return studentId;
  }

  private static void deleteStudent(EnrolmentServiceBlockingStub stub, BufferedReader userInput) throws IOException {
    System.out.println("Student ID : ");
    String studentId = userInput.readLine().trim();
    deleteStudentResponse response = stub.deleteStudent(deleteStudentRequest.newBuilder()
            .setStudentId(studentId)
            .build());
    if (response.getSuccess()) System.out.println("정상적으로 삭제되었습니다!");
    else System.out.println("실패했습니다! 다시 시도해주세요...");
  }

  private static void addCourse(EnrolmentServiceBlockingStub stub, BufferedReader userInput) throws IOException {
    System.out.println("------------ 강좌 정보 입력 ------------");
    System.out.println("강좌 ID : ");
    String courseId = userInput.readLine().trim();
    System.out.println("강좌 이름 : ");
    String courseName = userInput.readLine().trim();
    System.out.println("담당 교수 이름 : ");
    String professorName = userInput.readLine().trim();
    System.out.println("선수 과목 : ");
    String classRoomList = userInput.readLine().trim();

    addCourseResponse response = stub.addCourse(addCourseRequest.newBuilder()
            .setCourseId(courseId)
            .setCourseName(courseName)
            .setProfessorName(professorName)
            .setClassroomList(classRoomList)
            .build());
    if (response.getSuccess()) System.out.println("정상적으로 추가되었습니다!");
    else System.out.println("실패했습니다! 다시 시도해주세요...");
  }

  private static void deleteCourse(EnrolmentServiceBlockingStub stub, BufferedReader userInput) throws IOException {
    System.out.println("삭제하실 강좌의 id를 입력해주세요 : ");
    String courseId = userInput.readLine().trim();
    deleteCourseResponse response = stub.deleteCourse(deleteCourseRequest.newBuilder()
            .setCourseId(courseId)
            .build());
    if (response.getSuccess()) System.out.println("정상적으로 삭제되었습니다!");
    else System.out.println("실패했습니다! 다시 시도해주세요...");
  }

  private static void addReservation(EnrolmentServiceBlockingStub stub, BufferedReader userInput) throws IOException {
    System.out.println("-------------- 수강신청을 시작합니다 --------------");
    System.out.println("학생 ID를 입력해주세요 : ");
    String studentId = userInput.readLine().trim();
    System.out.println("수강신청 할 강좌 ID를 입력해주세요 : ");
    String courseId = userInput.readLine().trim();

    addReservationResponse response = stub.addReservation(addReservationRequest.newBuilder()
            .setStudentId(studentId)
            .setCourseId(courseId)
            .build());
    if (response.getSuccess()) System.out.println("정상적으로 추가되었습니다!");
    else System.out.println("실패했습니다! 다시 시도해주세요...");
  }

  private static void showMenu() {
    System.out.println("============ 메인메뉴 ============");
    System.out.println("1. 학생 목록 조회");
    System.out.println("2. 강좌 목록 조회");
    System.out.println("3. 학생 정보 등록");
    System.out.println("4. 학생 정보 제거");
    System.out.println("5. 강좌 정보 등록");
    System.out.println("6. 강좌 정보 제거");
    System.out.println("7. 학생 수강 신청");
    System.out.println("8. 로그아웃");
    System.out.println("x. 시스템종료");
  }
}

