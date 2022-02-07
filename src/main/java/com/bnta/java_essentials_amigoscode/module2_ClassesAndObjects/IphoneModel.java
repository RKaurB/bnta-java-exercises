package com.bnta.java_essentials_amigoscode.module2_ClassesAndObjects;

// 9.  ENUMS
// We can have all the iphone models in this class...
public enum IphoneModel {
    // ConstantS
    // IPHONE_X,
    // If we want to have the string representation of the Constant (e.g. IPHONE_X)
    IPHONE_X("Iphone X"),
    IPHONE_XR("Iphone XR"),
    IPHONE_SE("Iphone SE");


    // private String model;
    private String modelStr;

    // Add to Constructor
    IphoneModel(String modelStr) {
        // this.model = model;
        this.modelStr = modelStr;
    }

    // A way of us getting the actual model
    public String getModelStr() {
        // return model;
        return modelStr;
    }
}
