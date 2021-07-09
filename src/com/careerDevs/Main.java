package com.careerDevs;

public class Main {

    public static void main(String[] args) {

        Dispenser IceCreamDispenser1 = new Dispenser();

        IceCreamDispenser1.serveIceCream();
        System.out.println(IceCreamDispenser1.hopper.fillLvl);


    }
}
