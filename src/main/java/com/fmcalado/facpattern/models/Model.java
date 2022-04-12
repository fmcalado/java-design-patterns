package com.fmcalado.facpattern.models;

/**
 * Common interface for all buttons.
 */
public interface Model {
    void printID();
    int getID();
    boolean saveToDatabase();
}
