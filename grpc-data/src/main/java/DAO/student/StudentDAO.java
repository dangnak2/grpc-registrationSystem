package DAO.student;

import grpc.Student;

import java.util.ArrayList;

public interface StudentDAO {

  public boolean add(Student student);

  public boolean delete(int studentId);

  public Student get(String studentId);

  public boolean update(Student student);

  public int getSize();

  public ArrayList<Student> getStudentList();
}
