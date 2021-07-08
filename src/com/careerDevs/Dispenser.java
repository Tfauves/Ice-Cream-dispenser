package com.careerDevs;

public class Dispenser {


    public int tankFillLvl;


    public Dispenser(int tankFillLvl) {
        this.tankFillLvl = tankFillLvl;
    }


    public void dispenseIceCream() {

        tankFillLvl -= 10;

    }

    public void Clean() {

    }



}
