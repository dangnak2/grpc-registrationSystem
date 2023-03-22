//package DAO;
//
//import DTO.CourseDTO;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class DBCourseDAO extends DBConnector implements CourseDAO {
//
//  ArrayList<CourseDTO> courseList;
//
//  public DBCourseDAO() {
//    this.courseList = new ArrayList<>();
//    super.getConnection();
//    this.courseList = this.getCourseList();
//  }
//
//  public ArrayList<CourseDTO> getCourseList() {
//    String query = "select * from course;";
//    ResultSet rs = super.retrieve(query);
//    ArrayList<CourseDTO> courseList = new ArrayList<CourseDTO>();
//    try {
//      while (rs.next()) {
//        CourseDTO course = new CourseDTO();
//        course.setCourseId(rs.getInt("course_id"));
//        course.setCourseName(rs.getString("course_name"));
//        course.setProfessorName(rs.getString("professor_name"));
//        String p = rs.getString("prerequisite_list");
//        ArrayList<String> list = new ArrayList<>(Arrays.asList(p.split(" ")));
//        course.setClassRoomList(list);
//
//        courseList.add(course);
//      }
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }
//    return courseList;
//  }
//
//  @Override
//  public boolean add(CourseDTO course) {
//    String query = "insert into course values ("
//            + course.getCourseId() + ",'" + course.getCourseName() + "','" + course.getProfessorName()
//            + "','" + course.getClassRoomList() + ");";
//    if (super.create(query)) {
//      this.courseList = getCourseList();
//      return true;
//    }
//    return false;
//  }
//
//  @Override
//  public boolean delete(int courseId) {
//    String query = "delete from course where id=" + courseId;
//    if (super.delete(query)) {
//      this.courseList = this.getCourseList();
//      return true;
//    }
//    return false;
//  }
//
//  @Override
//  public CourseDTO get(int courseId) {
//    for (CourseDTO course : courseList) {
//      if (course.getCourseId() == courseId) {
//        return course;
//      }
//    }
//    return null;
//  }
//
//  @Override
//  public boolean update(CourseDTO course) {
//    String query = "update course set course_name = '"
//            + course.getCourseName() + "', professor_name = '" + course.getProfessorName();
//    if (super.update(query)) {
//      this.courseList = getCourseList();
//      return true;
//    }
//    return false;
//  }
//
//  @Override
//  public int getSize() {
//    return this.courseList.size();
//  }
//}
package DAO.course;

import DAO.DBConnector;
import grpc.Course;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class DBCourseDAO extends DBConnector implements CourseDAO {

  ArrayList<Course> courseList;

  public DBCourseDAO() {
    this.courseList = new ArrayList<>();
    super.getConnection();
    this.courseList = this.getCourseList();
  }

  public ArrayList<Course> getCourseList() {
    String query = "select * from course;";
    ResultSet rs = super.retrieve(query);
    ArrayList<Course> courseList = new ArrayList<Course>();
    try {
      while (rs.next()) {
        String p = rs.getString("prerequisite_list");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(p.split(" ")));
        Course course = Course.newBuilder()
                .setCourseId(rs.getString("course_id"))
                .setCourseName(rs.getString("course_name"))
                .setProfessorName(rs.getString("professor_name"))
                .addAllClassroomList(list)
                .build();
        courseList.add(course);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return courseList;
  }

  @Override
  public boolean add(Course course) {
    String query = "insert into course values ("
            + course.getCourseId() + ",'" + course.getCourseName() + "','" + course.getProfessorName()
            + "','" + course.getClassroomListList() + "'" + ");";
    if (super.create(query)) {
      this.courseList = getCourseList();
      return true;
    }
    return false;
  }

  @Override
  public boolean delete(int courseId) {
    String query = "delete from course where course_id=" + courseId;
    if (super.delete(query)) {
      this.courseList = this.getCourseList();
      return true;
    }
    return false;
  }

  @Override
  public Course get(String courseId) {
    for (Course course : courseList) {
      if (course.getCourseId().equals(courseId)) {
        return course;
      }
    }
    return null;
  }

  @Override
  public boolean update(Course course) {
    String query = "update course set course_name = '"
            + course.getCourseName() + "', professor_name = '" + course.getProfessorName();
    if (super.update(query)) {
      this.courseList = getCourseList();
      return true;
    }
    return false;
  }

  @Override
  public int getSize() {
    return this.courseList.size();
  }
}
