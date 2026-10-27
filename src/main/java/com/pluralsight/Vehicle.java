package com.pluralsight;

public class Vehicle {

    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometer;

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(long vehicleId, String makeModel, String color, int odometer) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    private double price;

    //create a variable that tells me how many vehicles are in the array right now

    //create a loop with this menu in the long

        /*
        1- List all vehicles
        2- Search by make/model
        3-Search by price range
        4- Search by color
        5-Add a vehicle
        6-Quit
        Enter Your Command
         */

    // focus on menu items 1,2, and 5











}
