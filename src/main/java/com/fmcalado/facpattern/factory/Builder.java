package com.fmcalado.facpattern.factory;

import com.fmcalado.facpattern.models.Model;
import com.fmcalado.singleton.database.DataSource;

import java.sql.SQLException;

public abstract class Builder {

    public void register() throws SQLException {
        Model okModel = buildModel();
        okModel.saveToDatabase(DataSource.getInstance().conn);
    }

    /**
     * Subclasses will override this method in order to create specific model
     * objects.
     */
    public abstract Model buildModel();
}
