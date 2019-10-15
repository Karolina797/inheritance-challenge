package com.karolinadutka;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private String type;
    private int currentGear;

    public Car(String name, String size, String direction, int wheels, int doors, int gears, boolean isManual, String type) {
        super(name, size, direction);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.currentGear = 1;
    }


    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public String getType() {
        return type;
    }

    public void carPresentation(){
        System.out.println("The name of the vehicle is: " + getName());
        System.out.println("The size of the vehicle is: " + getSize());
        System.out.println("The number of the wheels: " + getWheels());
        System.out.println("The number of the doors: " + getDoors());
        System.out.println("The number of the gears: " + getGears());
        System.out.println("Is the gearbox manual: " + isManual());
        System.out.println("The type of the car: " + getType());

    }

    public void changeVelocity(int speed, String direction){
        move(speed, direction);
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Change to " + this.currentGear + " gear.");
    }



}
