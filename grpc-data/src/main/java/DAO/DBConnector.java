package DAO;

import grpc.Course;

import java.sql.*;

public class DBConnector {
  private String server = "localhost"; // MySQL 서버 주소
  private String database = "Enrollment_System"; // MySQL DATABASE 이름
  private String user_name = "root"; //  MySQL 서버 아이디
  private String password = "123456789"; // MySQL 서버 비밀번호
  private Connection con;
  private Statement stmt;
  private ResultSet rs;

  public DBConnector() {
    this.con = null;
    this.stmt = null;
    this.rs = null;
  }

  public Connection getConnection() {
    // 1.드라이버 로딩
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
      e.printStackTrace();
    }

    // 2.연결
    try {
      this.con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?serverTimezone=UTC&useSSL=false", user_name, password);
      this.stmt = this.con.createStatement();
      this.stmt.executeUpdate("use Enrollment_System");

      return con;
    } catch (SQLException e) {
      System.err.println("con 오류:" + e.getMessage());
      e.printStackTrace();
    }

    return null;
  }

  public void releaseConnection(Connection con) {
    try {
      if (con != null)
        con.close();
      System.out.println("DB 연결이 정상적으로 해제되었습니다.");
    } catch (SQLException e) {
      System.out.println(e.getErrorCode());
    }
  }

  public boolean create(String query) {
    try {
      stmt = con.createStatement();
      if (!stmt.execute(query)) {
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean delete(String query) {
    try {
      stmt = con.createStatement();
      if (!stmt.execute(query)) {
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  public ResultSet retrieve(String query) {
    try {
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);

      return rs;

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public boolean update(String query) {
    try {
      stmt = con.createStatement();
      stmt.executeUpdate(query);
      stmt.close();
      return true;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

}
