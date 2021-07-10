package com.careerDevs;

public class Dispenser {
    public Hopper hopper;
    public IceCream softServe;

    public Dispenser() {
        softServe = new IceCream("Black Raspberry", 3);
        hopper = new Hopper(softServe.bagVol,1, 3.5);

    }

    public void serveIceCream() {
        hopper.fillLvl--;

        if (hopper.fillLvl <= hopper.minLvl) {
            System.out.printf("The hopper has %d gallons of %s flavored liquid ice cream. Please refill.\n",hopper.fillLvl ,softServe.flavor);
        }

        hopper.dispense();

    }
}
