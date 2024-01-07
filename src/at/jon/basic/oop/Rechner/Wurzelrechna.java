package at.jon.basic.oop.Rechner;

import static java.lang.Math.sqrt;

public class Wurzelrechna extends NormalaRechner{
    public void Wurzel(double Zahl){
        double Wurzelzahl= sqrt(Zahl);
        System.out.println("Ergebnis: " + Wurzelzahl);
    }

}
