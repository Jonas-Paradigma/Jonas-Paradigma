package at.jon.basic.oop.ErstesObjekt;

import at.jon.basic.oop.ErstesObjekt.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.color = "red";
        c1.fuelcosumption = 7;
        c1.serialnumber = "A1234";
        c1.fuelamount = 70;
        c1.maxfuelamount = 150;
        c1.amountOfRepititions = 3;
        c1.fuelconsumptionperkilometer = 0.3;


        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.color = "grey";
        c2.fuelcosumption = 4;
        c2.serialnumber = "M1234";
        c2.fuelamount = 20;
        c2.maxfuelamount = 150;
        c2.amountOfRepititions = 4;
        c2.fuelconsumptionperkilometer = 0.3;


        System.out.println(c2.fuelamount);
        c2.drive();
        System.out.println(c2.fuelamount);
        c2.bremsen();
        System.out.println(c2.turboboost);
        c2.turboboost();
        System.out.println(c2.honk);
        c2.honk();
        System.out.println(c2.getRamainingRange);
        c2.getRamainingRange();

}
}