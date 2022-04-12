package com.fmcalado.facpattern;

import com.fmcalado.facpattern.factory.Builder;
import com.fmcalado.facpattern.factory.UserBuilder;
import com.fmcalado.facpattern.factory.OrderBuilder;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Builder builder;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            builder = new OrderBuilder();
        } else {
            builder = new UserBuilder("Francisco", "Calado");
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        builder.printInfo();
    }
}
