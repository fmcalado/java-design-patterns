package com.fmcalado.facpattern.models;

/**
 * HTML button implementation.
 */
public class UserModel implements Model {
    private int id;

    public UserModel(int id){
        this.id = id;
    }

    public void printID() {
        System.out.println(getID());
    }

    public int getID() {
        return this.id;
    }

    @Override
    public boolean saveToDatabase() {
        return false;
    }
}
