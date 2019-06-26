package com.pinkal;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String Model) {
        // String validModel = Model.toLowerCase();

        if (Model.equals("Carrera") || Model.equals("comodore"))
        {
            this.model = Model;
        }else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
