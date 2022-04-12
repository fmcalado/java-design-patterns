package com.fmcalado.facpattern.factory;

import com.fmcalado.facpattern.models.Model;
import com.fmcalado.facpattern.models.OrderModel;

public class OrderBuilder extends Builder {

    @Override
    public Model buildModel() {
        //Do our stuff to build each model the way they need to be built
        return new OrderModel(1);
    }
}
