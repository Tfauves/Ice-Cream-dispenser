package com.careerDevs;

public class Main {

    public static void main(String[] args) {
	Dispenser iceCreamDispenser = new Dispenser(100);
        System.out.println(iceCreamDispenser.tankFillLvl);
	iceCreamDispenser.dispenseIceCream();
	iceCreamDispenser.dispenseIceCream();
	iceCreamDispenser.dispenseIceCream();
        System.out.println(iceCreamDispenser.tankFillLvl);

    }
}
