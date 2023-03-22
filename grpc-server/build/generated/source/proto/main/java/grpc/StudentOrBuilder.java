// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string studentId = 1;</code>
   * @return The studentId.
   */
  java.lang.String getStudentId();
  /**
   * <code>string studentId = 1;</code>
   * @return The bytes for studentId.
   */
  com.google.protobuf.ByteString
      getStudentIdBytes();

  /**
   * <code>string studentPw = 2;</code>
   * @return The studentPw.
   */
  java.lang.String getStudentPw();
  /**
   * <code>string studentPw = 2;</code>
   * @return The bytes for studentPw.
   */
  com.google.protobuf.ByteString
      getStudentPwBytes();

  /**
   * <code>string studentName = 3;</code>
   * @return The studentName.
   */
  java.lang.String getStudentName();
  /**
   * <code>string studentName = 3;</code>
   * @return The bytes for studentName.
   */
  com.google.protobuf.ByteString
      getStudentNameBytes();

  /**
   * <code>string studentDpt = 4;</code>
   * @return The studentDpt.
   */
  java.lang.String getStudentDpt();
  /**
   * <code>string studentDpt = 4;</code>
   * @return The bytes for studentDpt.
   */
  com.google.protobuf.ByteString
      getStudentDptBytes();

  /**
   * <code>repeated string completedCourses = 5;</code>
   * @return A list containing the completedCourses.
   */
  java.util.List<java.lang.String>
      getCompletedCoursesList();
  /**
   * <code>repeated string completedCourses = 5;</code>
   * @return The count of completedCourses.
   */
  int getCompletedCoursesCount();
  /**
   * <code>repeated string completedCourses = 5;</code>
   * @param index The index of the element to return.
   * @return The completedCourses at the given index.
   */
  java.lang.String getCompletedCourses(int index);
  /**
   * <code>repeated string completedCourses = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the completedCourses at the given index.
   */
  com.google.protobuf.ByteString
      getCompletedCoursesBytes(int index);
}