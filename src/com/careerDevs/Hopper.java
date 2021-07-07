package com.careerDevs;

public class Hopper {
    public int vol;
    public int minLvl = 25;

    public Hopper(int vol) {
        this.vol = vol;
    }

    public void refill() {
        if (vol <= minLvl) {
            System.out.println("hopper low, please refill");
        }

    }
}
