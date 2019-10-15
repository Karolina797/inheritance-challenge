package com.karolinadutka;

public class LexusRX300 extends Car {

private String typeOfBackSupport;

    public LexusRX300(String direction, String typeOfBackSupport) {
        super("Lexus RX300", "4WD", direction, 5, 5, 6, false, "SUV");
        this.typeOfBackSupport = typeOfBackSupport;
    }

    public String getTypeOfBackSupport() {
        return typeOfBackSupport;
    }


    @Override
    public void carPresentation() {
        super.carPresentation();
        System.out.println("The type of back support: " + getTypeOfBackSupport());
    }


    public void accelerate(int value) {

        int newVelocity = getVelocity() + value;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 30) {
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity <= 50) {
            changeGear(3);
        } else if (newVelocity > 50 && newVelocity <= 70) {
        changeGear(4);
        } else if (newVelocity > 50 && newVelocity <= 90) {
            changeGear(5);
        }
        else {
            changeGear(6);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity,getDirection());
        }

    }


}
