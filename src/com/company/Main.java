package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Car car1 = new Car(1976, "BMW");

        car1.setSpeed(0);

        car1.accelerate();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.accelerate();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.accelerate();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.accelerate();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.accelerate();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);

        car1.brake();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.brake();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.brake();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.brake();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);
        car1.brake();
        car1.getSpeed();
        System.out.println("Current Speed: " + car1.speed);

    }
}
