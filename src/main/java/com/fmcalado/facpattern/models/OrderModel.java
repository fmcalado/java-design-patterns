package com.fmcalado.facpattern.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderModel implements Model {
    int id;

    public OrderModel(int id){
        this.id = id;
    }


    @Override
    public boolean saveToDatabase(Connection conn) throws SQLException {
        String sqlQuery = "insert into orders(id) values(?)";
        PreparedStatement pst;
        pst = conn.prepareStatement(sqlQuery);
        pst.setInt(1, this.id);

        int created = pst.executeUpdate();
        if(created > 0) return true;

        return false;
    }
}
