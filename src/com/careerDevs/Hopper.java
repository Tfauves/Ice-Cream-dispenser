package com.careerDevs;

public class Hopper {
    public double fillLvl;
    final double MIN_LEVEL = 1.0;

    public Hopper(double bagVol) {
        this.fillLvl = bagVol;

    }

    public double refill(double bagVol) {
        double bagVolInOz = (bagVol * 128);
       return fillLvl = bagVolInOz;
    }

    public void dispense() {
        double servingSize  = 3.5;
        double afterServFillLvl = (fillLvl - servingSize);


//        System.out.println(fillLvl);
        System.out.println(afterServFillLvl);
    }
}
