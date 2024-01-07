package at.jon.basic.oop.Rechner;

public class NormalaRechner {
    public void Addition(double Zahl1, double Zahl2){
        double summe = 0;
        summe = Zahl1 + Zahl2;
        System.out.println("Summe: " + summe);
    }

    public void Differenz(double Zahl1, double Zahl2){
        double differenz = 0;
        differenz = Zahl1 - Zahl2;
        System.out.println("Differenz: " + differenz);
    }

    public void Multiplikation(double Zahl1, double Zahl2){
        double Produkt = 0;
        Produkt = Zahl1 * Zahl2;
        System.out.println("Produkt: " + Produkt);
    }

    public void Division(double Zahl1, double Zahl2){
        double Quotient = 0;
        Quotient = Zahl1 / Zahl2;
        System.out.println("Quotient: " + Quotient);
    }

}
