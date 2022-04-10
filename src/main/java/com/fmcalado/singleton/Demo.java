package com.fmcalado.singleton;

import com.fmcalado.singleton.database.DataSource;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        DataSource dataSource = DataSource.getInstance();
        Connection connection = dataSource.conn;


    }
}
