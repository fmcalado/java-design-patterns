package com.fmcalado.facpattern.factory;

import com.fmcalado.facpattern.models.Model;
import com.fmcalado.facpattern.models.UserModel;

public class UserBuilder extends Builder {

  @Override
  public Model buildModel() {
    return new UserModel("Francisco", "Calado");
  }
}
