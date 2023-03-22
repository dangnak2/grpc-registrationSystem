package DAO.reservation;

import grpc.Reservation;

import java.util.ArrayList;

public interface ReservationDAO {

  public boolean add(Reservation reservation);

  public boolean delete(int reservationId);

  public Reservation get(String reservationId);

  public boolean update(Reservation reservation);

  public int getSize();

  public ArrayList<Reservation> getReservationList();
}
