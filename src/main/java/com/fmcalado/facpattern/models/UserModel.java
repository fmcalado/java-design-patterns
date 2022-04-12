package com.fmcalado.facpattern.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserModel implements Model {
  String name, lastName;

  public UserModel(String name, String lastName){
    this.lastName = lastName;
    this.name = name;
  }

  @Override
  public boolean saveToDatabase(Connection conn) throws SQLException {
    String sqlQuery = "insert into users(name, last_name) values(?, ?)";
    PreparedStatement pst;
    pst = conn.prepareStatement(sqlQuery);
    pst.setString(1, this.name);
    pst.setString(2, this.lastName);

    int created = pst.executeUpdate();
    if(created > 0) return true;

    return false;
  }
}
