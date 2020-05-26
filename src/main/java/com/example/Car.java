package com.example;

public class Car implements CarInterface,NewFeaturedCar {

    private String color;
    private String company;
    private String model;
    private String number = "GJ212323";
    protected boolean isStarted =false;
    private boolean sunRoofOpened;

    // special method called constructor
    public Car(String company,String model){
        this.company = company;
        this.model= model;
        color = "While";
        speed=0;
    }
    //constructor  overloading should have different set of inputs
    public Car(String company,String model,String color){
        this.model=model;
        this.color=color;
        this.company=company;
        speed=0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    protected int speed =0;

    public int getSpeed(){
        return speed;
    }

    public void startCar(){
        isStarted = true;
        speed =0;
    }

    public void stopCar(){
        isStarted =false;
        speed =0;
    }

    public void accelerate(){
        if(isStarted) {
            speed += 10;
        }
    }

    public void applyBreak(){
        if(isStarted && speed>0) {
            speed -= 10;
        }
    }

    @Override
    public void openSunRoof() {
        this.sunRoofOpened = true;
    }

    @Override
    public void closeSunRoof() {
        sunRoofOpened =false;
    }
}
