package com.fmcalado.singleton;

import com.fmcalado.singleton.database.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo {
  public static void main(String[] args) throws SQLException {
    DataSource dataSource = DataSource.getInstance();
    Connection connection = dataSource.conn;
    PreparedStatement pst;

    String sqlQuery = "insert into users(name) values(?)";
    pst = connection.prepareStatement(sqlQuery);
    pst.setString(1, "Calado");

    int created = pst.executeUpdate();
    if(created > 0){
      System.out.println("User was successfully created");
    }

  }
}
