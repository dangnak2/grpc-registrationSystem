// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

public interface CourseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.Course)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string courseId = 1;</code>
   * @return The courseId.
   */
  java.lang.String getCourseId();
  /**
   * <code>string courseId = 1;</code>
   * @return The bytes for courseId.
   */
  com.google.protobuf.ByteString
      getCourseIdBytes();

  /**
   * <code>string courseName = 2;</code>
   * @return The courseName.
   */
  java.lang.String getCourseName();
  /**
   * <code>string courseName = 2;</code>
   * @return The bytes for courseName.
   */
  com.google.protobuf.ByteString
      getCourseNameBytes();

  /**
   * <code>string professorName = 3;</code>
   * @return The professorName.
   */
  java.lang.String getProfessorName();
  /**
   * <code>string professorName = 3;</code>
   * @return The bytes for professorName.
   */
  com.google.protobuf.ByteString
      getProfessorNameBytes();

  /**
   * <code>repeated string classroomList = 4;</code>
   * @return A list containing the classroomList.
   */
  java.util.List<java.lang.String>
      getClassroomListList();
  /**
   * <code>repeated string classroomList = 4;</code>
   * @return The count of classroomList.
   */
  int getClassroomListCount();
  /**
   * <code>repeated string classroomList = 4;</code>
   * @param index The index of the element to return.
   * @return The classroomList at the given index.
   */
  java.lang.String getClassroomList(int index);
  /**
   * <code>repeated string classroomList = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the classroomList at the given index.
   */
  com.google.protobuf.ByteString
      getClassroomListBytes(int index);
}
