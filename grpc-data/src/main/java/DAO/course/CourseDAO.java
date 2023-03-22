package DAO.course;

import grpc.Course;

import java.util.ArrayList;

public interface CourseDAO {

  public boolean add(Course course);

  public boolean delete(int courseId);

  public Course get(String courseId);

  public boolean update(Course course);

  public int getSize();

  public ArrayList<Course> getCourseList();
}
