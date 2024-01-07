package at.jon.basic.oop.Konto;

public class Sparbuch extends Basiskonto {
    private double Zinssatz;


    public void Auszahlung(double dSumme){
        if(dSumme <= getKontostand()) {
            System.out.println("Es wurde " + dSumme + "€ abgehoben");
            double dNeuerKontostand = getKontostand() - dSumme;
            setKontostand(dNeuerKontostand);
        } else {
            System.out.println("Saldo zu klein!");
        }
    }
    public void Zinszahlung(){
        double dZinsen = getKontostand() / 100 * getZinssatz();
        double dNeuerKontostand = getKontostand() + dZinsen;
        setKontostand(dNeuerKontostand);
        System.out.println("Es werden " + dZinsen + "€ als Zinsen zugeschrieben");
    }
    public Sparbuch(String hersteller, String kartenname, int kartennummer, String IBAN, double kontostand, double Zinssatz) {
        super(hersteller, kartenname, kartennummer, IBAN, kontostand);
        this.Zinssatz = Zinssatz;
    }
    public double getZinssatz() {
        return Zinssatz;
    }
}
