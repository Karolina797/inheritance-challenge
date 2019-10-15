package com.karolinadutka;

public class Vehicle {

    private String name;
    private String size;
    private int velocity;
    private String direction;


    public Vehicle(String name, String size, String direction) {
        this.name = name;
        this.size = size;
        this.direction = direction;
        this.velocity = 0;

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void move (int velocity, String direction){
        this.velocity = velocity;
        this.direction = direction;
        System.out.println(" Moving at " + this.velocity + " to the " + this.direction);
    }


    public void stop(){
        this.velocity = 0;
    }

}
