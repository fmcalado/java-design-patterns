package com.fmcalado.singleton.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {

    private static DataSource instance;
    public Connection conn;

    private DataSource() throws SQLException {
        HikariDataSource ds;
        HikariConfig config = new HikariConfig();

        config.setDriverClassName("org.postgresql.Driver");
        config.setJdbcUrl("jdbc:postgresql://ec2-52-201-124-168.compute-1.amazonaws.com:5432/dbvesp0t9g8j83");
        config.setUsername("bunlqvqsduuijo");
        config.setPassword("00cc6a110d9c61e4fd871e638d32e1caa434ad0edd17315fcac20fcbc74e1313");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(config);

        this.conn = ds.getConnection();
    }

    public static DataSource getInstance() {
        if (instance == null) {
            try {
                instance = new DataSource();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return instance;
    }
}