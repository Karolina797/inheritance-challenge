package com.karolinadutka;

public class Main {

    public static void main(String[] args) {

        LexusRX300 lexusRX300 = new LexusRX300("North", "camera");
        lexusRX300.carPresentation();
        System.out.println();
        lexusRX300.accelerate(60);
        System.out.println();
        lexusRX300.setDirection("East");
        lexusRX300.accelerate(60);



    }
}
