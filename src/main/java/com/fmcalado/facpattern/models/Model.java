package com.fmcalado.facpattern.models;

import java.sql.Connection;
import java.sql.SQLException;

public interface Model {
    boolean saveToDatabase(Connection conn) throws SQLException;
}
