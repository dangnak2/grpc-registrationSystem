// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

public interface isRegisteredCourseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.isRegisteredCourseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpc.Course course = 1;</code>
   * @return Whether the course field is set.
   */
  boolean hasCourse();
  /**
   * <code>.grpc.Course course = 1;</code>
   * @return The course.
   */
  grpc.Course getCourse();
  /**
   * <code>.grpc.Course course = 1;</code>
   */
  grpc.CourseOrBuilder getCourseOrBuilder();

  /**
   * <code>string status = 2;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 2;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
