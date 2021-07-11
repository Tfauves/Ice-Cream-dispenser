package com.careerDevs;



public class Dispenser {
    public Hopper hopper;
    public IceCream softServe;

    public Dispenser() {
        softServe = new IceCream("Black Raspberry", 3.5);
        hopper = new Hopper(softServe.bagVol);
        hopper.refill(softServe.bagVol);


    }

    public void serveIceCream() {
//        if (hopper.fillLvl <= hopper.MIN_LEVEL) {
//            System.out.printf("The hopper has %f gallons of %s flavored liquid ice cream. Please refill.\n",hopper.fillLvl ,softServe.flavor);
//        }

        hopper.dispense();

    }

}
