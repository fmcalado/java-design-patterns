package com.fmcalado.facpattern.factory;

import com.fmcalado.facpattern.models.Model;
import com.fmcalado.facpattern.models.UserModel;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class UserBuilder extends Builder {
    String name, lastName;

    public UserBuilder(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public Model buildModel() {
        //Do our stuff to build each model the way they need to be built
        return new UserModel(1);
    }
}
