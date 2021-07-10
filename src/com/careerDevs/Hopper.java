package com.careerDevs;

public class Hopper {
    public double capacityInGal;
    public int fillLvl;
    public int minLvl;

    public Hopper(int fillLvl, int minLvl, double capacityInGal) {
        this.fillLvl = fillLvl;
        this.minLvl = minLvl;
        this.capacityInGal = capacityInGal;
    }

    public int refill(double bagVol) {
       return fillLvl++;
    }

    public void dispense() {
        double totalServings = Math.round((fillLvl * 128) / 3.5);
        double servingSize  = 3.5;
        fillLvl--;
        double iceCreamServed = totalServings - servingSize;
        System.out.println(iceCreamServed);
    }
}
