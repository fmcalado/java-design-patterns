package com.fmcalado.facpattern.factory;

import com.fmcalado.facpattern.models.Model;
import com.fmcalado.singleton.database.DataSource;

import java.sql.SQLException;

public abstract class Builder {

  public void register() throws SQLException {
    Model okModel = buildModel();
    okModel.saveToDatabase(DataSource.getInstance().conn);
  }

  public abstract Model buildModel();
}
