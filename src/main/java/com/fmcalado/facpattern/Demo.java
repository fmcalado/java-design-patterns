package com.fmcalado.facpattern;

import com.fmcalado.facpattern.factory.Builder;
import com.fmcalado.facpattern.factory.UserBuilder;
import com.fmcalado.facpattern.factory.OrderBuilder;

import java.sql.SQLException;

public class Demo {
    private static Builder builder;

    public static void main(String[] args) throws SQLException {
        configure();
        registerModel();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            builder = new UserBuilder();
        } else {
            builder = new OrderBuilder();
        }
    }

    static void registerModel() throws SQLException {
        builder.register();
    }
}
