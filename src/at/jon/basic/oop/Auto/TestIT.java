package at.jon.basic.oop.Auto;

import at.jon.basic.oop.Auto.Auto;
import at.jon.basic.oop.Auto.Fahrrad;
import at.jon.basic.oop.Auto.Flasche;
import at.jon.basic.oop.Auto.Getränkekiste;

public class TestIT {
    public static void main(String[] args) {
        Flasche flasche = new Flasche("cola", 500, "cola zero");
        Getränkekiste getränkekiste = new Getränkekiste(24, flasche);
        Auto auto = new Auto(300, "rot");
        Auto auto1 = new Auto();

        Flasche flasche1 = new Flasche("voüs", 330, "cola");
        //System.out.println(auto.getKofferraumGetraenke().getFlasche().getShersteller());
        //auto.getKofferraumGetraenke().setFlasche(flasche1);

        auto.setiLeistung(300);
        auto.setsFarbe("rot");
        //auto.iLeistung = 400;


        Fahrrad fahrrad = new Fahrrad();
        fahrrad.getIrahmengroesse();
        fahrrad.setsFarbe("keine Farbe");




        auto.setKofferraumfahhrad(fahrrad);
        auto.setKofferraumGetraenke(getränkekiste);

        System.out.println(fahrrad.getIrahmengroesse());
        System.out.println(fahrrad.getsFarbe());
        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe());
        System.out.println("Im Auto sind " + getränkekiste.getIanzahl() + " Flaschen gefüllt mit " + flasche.getSgefuelltmit());
    }
}
