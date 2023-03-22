package DAO.student;

import DAO.DBConnector;
import grpc.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class DBStudentDAO extends DBConnector implements StudentDAO {

  ArrayList<Student> studentList;

  public DBStudentDAO() {
    this.studentList = new ArrayList<>();
    super.getConnection();
    this.studentList = this.getStudentList();
  }

  @Override
  public ArrayList<Student> getStudentList() {
    String query = "select * from student;";
    ResultSet rs = super.retrieve(query);
    ArrayList<Student> studentList = new ArrayList<>();
    try {
      while (rs.next()) {
        String c = rs.getString("completed_courses_list");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(c.split(" ")));
        Student student = Student.newBuilder()
                .setStudentId(rs.getString("student_id"))
                .setStudentPw(rs.getString("student_pw"))
                .setStudentName(rs.getString("student_name"))
                .setStudentDpt(rs.getString("department"))
                .addAllCompletedCourses(list)
                .build();

        studentList.add(student);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return studentList;
  }

  @Override
  public boolean add(Student student) {
    String query = "insert into student values ("
            + student.getStudentId() + ",'" + student.getStudentPw() + "','" + student.getStudentId()
            + "','" + student.getStudentDpt() + "'," + "'" + student.getCompletedCoursesList() + "'" + ");";
    if (super.create(query)) {
      this.studentList = getStudentList();
      return true;
    }
    return false;
  }

  @Override
  public Student get(String studentId) {
    for (Student student : studentList) {
      if (student.getStudentId().equals(studentId)) {
        return student;
      }
    }
    return null;
  }

  @Override
  public boolean update(Student student) {
    String query = "update student set student_pw = '"
            + student.getStudentPw() + "', student_name = '" + student.getStudentName() + "', department = '" + student.getStudentDpt();

    if (super.update(query)) {
      this.studentList = getStudentList();
      return true;
    }

    return false;
  }

  @Override
  public boolean delete(int studentId) {
    String query = "delete from student where student_id=" + studentId;
    if (super.delete(query)) {
      this.studentList = this.getStudentList();
      return true;
    }
    return false;
  }

  @Override
  public int getSize() {
    return this.studentList.size();
  }
}

