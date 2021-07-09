package com.careerDevs;

public class Hopper {
    public int capacityInGal = 3;
    public int fillLvl;
    public int minLvl;

    public Hopper(int fillLvl, int minLvl) {
        this.fillLvl = fillLvl;
        this.minLvl = minLvl;
    }

    public int refill(int bagVol) {
       return fillLvl++;
    }

    public int dispense() {

        return fillLvl--;
    }
}
