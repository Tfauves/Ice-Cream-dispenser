package com.careerDevs;

public class Hopper {
    public double capacityInGal;
    public double fillLvl;
    final double MIN_LEVEL = 1.0;

    public Hopper(double bagVol) {
        this.fillLvl = bagVol;

    }

    public double refill(double bagVol) {
       return fillLvl++;
    }

    public void dispense() {
        double totalServings = Math.round((fillLvl * 128) / 3.5);
        double servingSize  = 3.5;
//        fillLvl--;
        double iceCreamServed = totalServings - servingSize;
        //System.out.println(iceCreamServed);
    }
}
