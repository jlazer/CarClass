package com.company;

public class Car {
    int yearModel;
    String make;
    int speed;
    public Car(int year, String brand){
        yearModel = year;
        make = brand;
    }

    public void setMake(String newValue) {
        make = newValue;

    }
    public void setSpeed(int newValue) {
        speed = newValue;
    }
    public void setYearModel(int newValue) {
        yearModel = newValue;
    }

    public String getMake(){
        return make;
    }
    public int getSpeed() {
        return speed;
    }
    public int getYearModel() {
        return yearModel;
    }
    public void accelerate(){
        speed = speed + 5;
    }
    public void brake() {
        speed = speed - 5;
    }

}