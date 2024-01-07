package at.jon.basic.oop.Rechner;

import static java.lang.Math.*;
import static java.lang.Math.toRadians;
public class Wissenschaftrechna extends NormalaRechner {

    public void Sinus(double Zahl) {
        double Ergebnis = sin(toRadians(Zahl));
        System.out.println("Das Ergebnis beträgt " + Ergebnis);
    }

    public void Cosinus(double Zahl) {
        double Ergebnis = cos(toRadians(Zahl));
        System.out.println("Das Ergebnis beträgt " + Ergebnis);
    }


}
