// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

public interface getAllCourseDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.getAllCourseDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .grpc.Course course = 1;</code>
   */
  java.util.List<grpc.Course> 
      getCourseList();
  /**
   * <code>repeated .grpc.Course course = 1;</code>
   */
  grpc.Course getCourse(int index);
  /**
   * <code>repeated .grpc.Course course = 1;</code>
   */
  int getCourseCount();
  /**
   * <code>repeated .grpc.Course course = 1;</code>
   */
  java.util.List<? extends grpc.CourseOrBuilder> 
      getCourseOrBuilderList();
  /**
   * <code>repeated .grpc.Course course = 1;</code>
   */
  grpc.CourseOrBuilder getCourseOrBuilder(
      int index);
}