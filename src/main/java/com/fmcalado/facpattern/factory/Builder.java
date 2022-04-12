package com.fmcalado.facpattern.factory;

import com.fmcalado.facpattern.models.Model;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Builder {

    public void printInfo() {
        // ... other code ...

        Model okModel = buildModel();
        okModel.saveToDatabase();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Model buildModel();
}
