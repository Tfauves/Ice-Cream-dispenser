package com.careerDevs;

public class Dispenser {
    public Hopper hopper;
    public IceCream softServe;

    public Dispenser() {
        softServe = new IceCream("Black Raspberry", 10);
        hopper = new Hopper(softServe.bagVol,25);

    }

    public void serveIceCream() {
//        int vol;
//        vol = hopper.dispense();
        hopper.fillLvl--;

       // System.out.println(vol);

        if (hopper.fillLvl <= hopper.minLvl) {
            System.out.printf("The hopper has %d gallons of %s flavored liquid ice cream. Please refill.",hopper.fillLvl ,softServe.flavor);
        }
    }
}
