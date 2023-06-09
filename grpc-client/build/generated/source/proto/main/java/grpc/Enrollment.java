// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

public final class Enrollment {
  private Enrollment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Course_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Course_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_getAllStudentDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_getAllStudentDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_getAllCourseDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_getAllCourseDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_addStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_addStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_addStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_addStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_deleteStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_deleteStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_deleteStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_deleteStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_addCourseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_addCourseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_addCourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_addCourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_deleteCourseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_deleteCourseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_deleteCourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_deleteCourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_isRegisteredStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_isRegisteredStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_isRegisteredStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_isRegisteredStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_isRegisteredCourseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_isRegisteredCourseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_isRegisteredCourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_isRegisteredCourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_validateLoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_validateLoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_validateLoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_validateLoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_addReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_addReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_addReservationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_addReservationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Reservation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Reservation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Enrollment.proto\022\004grpc\032\034google/protobu" +
      "f/struct.proto\"r\n\007Student\022\021\n\tstudentId\030\001" +
      " \001(\t\022\021\n\tstudentPw\030\002 \001(\t\022\023\n\013studentName\030\003" +
      " \001(\t\022\022\n\nstudentDpt\030\004 \001(\t\022\030\n\020completedCou" +
      "rses\030\005 \003(\t\"\\\n\006Course\022\020\n\010courseId\030\001 \001(\t\022\022" +
      "\n\ncourseName\030\002 \001(\t\022\025\n\rprofessorName\030\003 \001(" +
      "\t\022\025\n\rclassroomList\030\004 \003(\t\";\n\031getAllStuden" +
      "tDataResponse\022\036\n\007student\030\001 \003(\0132\r.grpc.St" +
      "udent\"8\n\030getAllCourseDataResponse\022\034\n\006cou" +
      "rse\030\001 \003(\0132\014.grpc.Course\"|\n\021addStudentReq" +
      "uest\022\021\n\tstudentId\030\001 \001(\t\022\021\n\tstudentPw\030\002 \001" +
      "(\t\022\023\n\013studentName\030\003 \001(\t\022\022\n\nstudentDpt\030\004 " +
      "\001(\t\022\030\n\020completedCourses\030\005 \001(\t\"%\n\022addStud" +
      "entResponse\022\017\n\007success\030\001 \001(\010\")\n\024deleteSt" +
      "udentRequest\022\021\n\tstudentId\030\001 \001(\t\"(\n\025delet" +
      "eStudentResponse\022\017\n\007success\030\001 \001(\010\"f\n\020add" +
      "CourseRequest\022\020\n\010courseId\030\001 \001(\t\022\022\n\ncours" +
      "eName\030\002 \001(\t\022\025\n\rprofessorName\030\003 \001(\t\022\025\n\rcl" +
      "assroomList\030\004 \001(\t\"$\n\021addCourseResponse\022\017" +
      "\n\007success\030\001 \001(\010\"\'\n\023deleteCourseRequest\022\020" +
      "\n\010courseId\030\001 \001(\t\"\'\n\024deleteCourseResponse" +
      "\022\017\n\007success\030\001 \001(\010\"/\n\032isRegisteredStudent" +
      "Request\022\021\n\tstudentId\030\001 \001(\t\"M\n\033isRegister" +
      "edStudentResponse\022\036\n\007student\030\001 \001(\0132\r.grp" +
      "c.Student\022\016\n\006status\030\002 \001(\t\"-\n\031isRegistere" +
      "dCourseRequest\022\020\n\010courseId\030\001 \001(\t\"J\n\032isRe" +
      "gisteredCourseResponse\022\034\n\006course\030\001 \001(\0132\014" +
      ".grpc.Course\022\016\n\006status\030\002 \001(\t\"8\n\024validate" +
      "LoginRequest\022\017\n\007inputId\030\001 \001(\t\022\017\n\007inputPw" +
      "\030\002 \001(\t\"(\n\025validateLoginResponse\022\017\n\007succe" +
      "ss\030\001 \001(\010\"<\n\025addReservationRequest\022\021\n\tstu" +
      "dentId\030\001 \001(\t\022\020\n\010courseId\030\002 \001(\t\")\n\026addRes" +
      "ervationResponse\022\017\n\007success\030\001 \001(\010\"I\n\013Res" +
      "ervation\022\025\n\rreservationId\030\001 \001(\t\022\021\n\tstude" +
      "ntId\030\002 \001(\t\022\020\n\010courseId\030\003 \001(\t\"\007\n\005Empty2\206\006" +
      "\n\020EnrolmentService\022C\n\021getAllStudentData\022" +
      "\013.grpc.Empty\032\037.grpc.getAllStudentDataRes" +
      "ponse\"\000\022A\n\020getAllCourseData\022\013.grpc.Empty" +
      "\032\036.grpc.getAllCourseDataResponse\"\000\022A\n\nad" +
      "dStudent\022\027.grpc.addStudentRequest\032\030.grpc" +
      ".addStudentResponse\"\000\022J\n\rdeleteStudent\022\032" +
      ".grpc.deleteStudentRequest\032\033.grpc.delete" +
      "StudentResponse\"\000\022>\n\taddCourse\022\026.grpc.ad" +
      "dCourseRequest\032\027.grpc.addCourseResponse\"" +
      "\000\022G\n\014deleteCourse\022\031.grpc.deleteCourseReq" +
      "uest\032\032.grpc.deleteCourseResponse\"\000\022\\\n\023is" +
      "RegisteredStudent\022 .grpc.isRegisteredStu" +
      "dentRequest\032!.grpc.isRegisteredStudentRe" +
      "sponse\"\000\022Y\n\022isRegisteredCourse\022\037.grpc.is" +
      "RegisteredCourseRequest\032 .grpc.isRegiste" +
      "redCourseResponse\"\000\022M\n\016addReservation\022\033." +
      "grpc.addReservationRequest\032\034.grpc.addRes" +
      "ervationResponse\"\000\022J\n\rvalidateLogin\022\032.gr" +
      "pc.validateLoginRequest\032\033.grpc.validateL" +
      "oginResponse\"\000B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_grpc_Student_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Student_descriptor,
        new java.lang.String[] { "StudentId", "StudentPw", "StudentName", "StudentDpt", "CompletedCourses", });
    internal_static_grpc_Course_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_Course_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Course_descriptor,
        new java.lang.String[] { "CourseId", "CourseName", "ProfessorName", "ClassroomList", });
    internal_static_grpc_getAllStudentDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_getAllStudentDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_getAllStudentDataResponse_descriptor,
        new java.lang.String[] { "Student", });
    internal_static_grpc_getAllCourseDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_getAllCourseDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_getAllCourseDataResponse_descriptor,
        new java.lang.String[] { "Course", });
    internal_static_grpc_addStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpc_addStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_addStudentRequest_descriptor,
        new java.lang.String[] { "StudentId", "StudentPw", "StudentName", "StudentDpt", "CompletedCourses", });
    internal_static_grpc_addStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpc_addStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_addStudentResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_grpc_deleteStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_grpc_deleteStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_deleteStudentRequest_descriptor,
        new java.lang.String[] { "StudentId", });
    internal_static_grpc_deleteStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_grpc_deleteStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_deleteStudentResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_grpc_addCourseRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_grpc_addCourseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_addCourseRequest_descriptor,
        new java.lang.String[] { "CourseId", "CourseName", "ProfessorName", "ClassroomList", });
    internal_static_grpc_addCourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_grpc_addCourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_addCourseResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_grpc_deleteCourseRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_grpc_deleteCourseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_deleteCourseRequest_descriptor,
        new java.lang.String[] { "CourseId", });
    internal_static_grpc_deleteCourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_grpc_deleteCourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_deleteCourseResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_grpc_isRegisteredStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_grpc_isRegisteredStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_isRegisteredStudentRequest_descriptor,
        new java.lang.String[] { "StudentId", });
    internal_static_grpc_isRegisteredStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_grpc_isRegisteredStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_isRegisteredStudentResponse_descriptor,
        new java.lang.String[] { "Student", "Status", });
    internal_static_grpc_isRegisteredCourseRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_grpc_isRegisteredCourseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_isRegisteredCourseRequest_descriptor,
        new java.lang.String[] { "CourseId", });
    internal_static_grpc_isRegisteredCourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_grpc_isRegisteredCourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_isRegisteredCourseResponse_descriptor,
        new java.lang.String[] { "Course", "Status", });
    internal_static_grpc_validateLoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_grpc_validateLoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_validateLoginRequest_descriptor,
        new java.lang.String[] { "InputId", "InputPw", });
    internal_static_grpc_validateLoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_grpc_validateLoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_validateLoginResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_grpc_addReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_grpc_addReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_addReservationRequest_descriptor,
        new java.lang.String[] { "StudentId", "CourseId", });
    internal_static_grpc_addReservationResponse_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_grpc_addReservationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_addReservationResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_grpc_Reservation_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_grpc_Reservation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Reservation_descriptor,
        new java.lang.String[] { "ReservationId", "StudentId", "CourseId", });
    internal_static_grpc_Empty_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_grpc_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Empty_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
