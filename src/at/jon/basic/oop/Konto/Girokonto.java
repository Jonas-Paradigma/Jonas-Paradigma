package at.jon.basic.oop.Konto;

public class Girokonto extends Basiskonto {

    private double Überzug;

    public void Auszahlung(double dSumme){
        if((Überzug + getKontostand()) >= dSumme) {
            System.out.println("Es wurden " + dSumme + "€ abgehoben");
            double dNeuerKontostand = getKontostand() - dSumme;
            setKontostand(dNeuerKontostand);
        } else {
            System.out.println("Sie haben das Limit überschritten!");
        }
    }

    public Girokonto(String hersteller, String kartenname, int kartennummer, String IBAN, double kontostand, double Überzug) {
        super(hersteller, kartenname, kartennummer, IBAN, kontostand);
        this.Überzug = Überzug;

    }
    public double getdÜberziehungsrahmen() {
        return Überzug;
    }
}
