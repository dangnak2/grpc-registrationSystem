package DAO.reservation;

import DAO.DBConnector;
import grpc.Course;
import grpc.Reservation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class DBReservationDAO extends DBConnector implements ReservationDAO {

  ArrayList<Reservation> reservationList;

  public DBReservationDAO() {
    this.reservationList = new ArrayList<>();
    super.getConnection();
    this.reservationList = this.getReservationList();
  }

  public ArrayList<Reservation> getReservationList() {
    String query = "select * from reservation;";
    ResultSet rs = super.retrieve(query);
    ArrayList<Reservation> reservationList = new ArrayList<>();
    try {
      while (rs.next()) {
        Reservation reservation = Reservation.newBuilder()
                .setReservationId(rs.getString("reservation_id"))
                .setStudentId(rs.getString("student_id"))
                .setCourseId(rs.getString("course_id"))
                .build();
        reservationList.add(reservation);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return reservationList;
  }

  @Override
  public boolean add(Reservation reservation) {
    String query = "insert into reservation (student_id, course_id) values (" + reservation.getStudentId() + ",'" + reservation.getCourseId() + "'" + ");";
    if (super.create(query)) {
      this.reservationList = getReservationList();
      return true;
    }
    return false;
  }

  @Override
  public boolean delete(int reservationId) {
    return false;
  }

  @Override
  public Reservation get(String reservationId) {
    return null;
  }

  @Override
  public boolean update(Reservation reservation) {
    return false;
  }

  @Override
  public int getSize() {
    return 0;
  }
}
