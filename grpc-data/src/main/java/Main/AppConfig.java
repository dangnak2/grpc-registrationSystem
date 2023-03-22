package Main;

import DAO.course.CourseDAO;
import DAO.course.DBCourseDAO;
import DAO.reservation.DBReservationDAO;
import DAO.reservation.ReservationDAO;
import DAO.student.DBStudentDAO;
import DAO.student.StudentDAO;

public class AppConfig {

  public CourseDAO CourseDAO() {
    return new DBCourseDAO();
  }

  public StudentDAO StudentDAO() {
    return new DBStudentDAO();
  }

  public ReservationDAO ReservationDAO() {
    return new DBReservationDAO();
  }
}
