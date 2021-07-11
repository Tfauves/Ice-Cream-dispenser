package com.careerDevs;



public class Dispenser {
    public Hopper hopper;
    public IceCream softServe;

    public Dispenser() {
        softServe = new IceCream("Black Raspberry", 0.2);
        hopper = new Hopper(softServe.bagVol);


    }

    public void serveIceCream() {
        //hopper.fillLvl--;

        if (hopper.fillLvl <= hopper.MIN_LEVEL) {
            System.out.printf("The hopper has %f gallons of %s flavored liquid ice cream. Please refill.\n",hopper.fillLvl ,softServe.flavor);
        }

        hopper.dispense();

    }

}
