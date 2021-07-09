package com.careerDevs;

public class Dispenser {
    public Hopper hopper;

    public Dispenser() {

        hopper = new Hopper(100,25);

    }

    public void serveIceCream() {
        int vol;
        vol = hopper.dispense();

        System.out.println(vol);

        if (hopper.fillLvl == hopper.minLvl) {
            System.out.println("you need to refill the hopper");
        }
    }
}
