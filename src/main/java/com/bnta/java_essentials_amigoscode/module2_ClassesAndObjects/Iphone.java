package com.bnta.java_essentials_amigoscode.module2_ClassesAndObjects;

// 1.  CREATE IPHONE CLASS
public class Iphone {

    // 2. DEFINE PROPERTIES
    // e.g. model, price, water resistance, etc...
    // the private keyword (below) is called encapsulation, and is how we hide data from the outside world
    // private String model;
    // Take model from IphoneModels enum instead of String
    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    // 7.  CONSTRUCTORS
    // By default, every class comes with a default Constructor, which means we don't have to pass anything into the new Iphone object
    // We don't need this here, as it's given to us by default...
    public Iphone(){}

    // We are using this Constructor to set the initial values
    // public Iphone(String model, double price, boolean isWaterResistant) {
    public Iphone(IphoneModel model, double price, boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }
    // We can have as many Constructors as we want
    // E.g. if we want to have one Constructor that only sets the model
    // public Iphone(String model) {
    public Iphone(IphoneModel model) {
        // this() is saying that we can call out to/re-use other Constructors
        // i.e. using the 'this' keyword to invoke other Constructors
        this(model, 0.0, false);
        this.model = model;
    }

    // Recall that the 'this' keyword is referring to the current instance of the current class
    // public Iphone(String model, double price) {
    public Iphone(IphoneModel model, double price) {
        this(model, price, false);
        this.model = model;
        this.price = price;
    }

    // ***************** GETTERS & SETTERS *****************

    // 3.  GENERATE GETTERS AND SETTERS - Control + Enter --> Generate Getters and Setters (for all)
    // And this produces (see below) some methods (e.g. getModel, setModel, getPrice, setPrice, etc)...
    // These are the actual behaviours - the functionality of a given object, based on the class (e.g. Iphone class)
    // So, given the phone, we can request to know what the actual model/current price is
    // We can also change the price of the phone (e.g. say if after 2 years, the price goes down)

    // public String getModel() {
    public IphoneModel getModel() {
        return model;
    }

    // public void setModel(String model) {
    public void setModel(IphoneModel model) {
        // e.g. this.model - is referring to the current instance of the current class
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        // isWaterResistant = waterResistant;
        this.isWaterResistant = waterResistant;
    }

    // NEXT:  Go to Classes.java - 4. CREATE OBJECTS

    // *******************************************************

    // 8.  TOSTRING (toString)
    // toString allows us to have the String representation of the Object
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }

}
