package com.careerDevs;

public class Hopper {
    public final int HOPPER_CAPACITY_IN_GAL = 3;
    public int fillLvl;
    public int minLvl;

    public Hopper(int fillLvl, int minLvl) {

        this.fillLvl = fillLvl;
        this.minLvl = minLvl;


    }

    public void refill() {
        fillLvl++;
    }

    public String dispense() {
//factor overrun
        fillLvl--;
        return "";
    }
}
