package at.jon.basic.oop.Konto;

public class Kreditkonto extends Basiskonto{
    private double Zinssatz;

    public void Einzahlung(double dSumme){
        if(dSumme <= (getKontostand() * -1)) {
            System.out.println("Es wurde " + dSumme + "€ eingezahlt");
            double dNeuerKontostand = getKontostand() + dSumme;
            setKontostand(dNeuerKontostand);
        } else{
            System.out.println("Einzahlung zu hoch");
        }
    }

    public void Zinszahlung(){
        double dZinsen = getKontostand() / 100 * getZinssatz();
        double dNeuerKontostand = getKontostand() - dZinsen;
        setKontostand(dNeuerKontostand);
        System.out.println("Ihnen wurde " + dZinsen + "€ aufgrund von Zinsen abgezogen");
    }

    public double getZinssatz() {
        return Zinssatz;
    }

    public Kreditkonto(String hersteller, String kartenname, int kartennummer, String IBAN, double kontostand, double Zinssatz) {
        super(hersteller, kartenname, kartennummer, IBAN, kontostand);
        this.Zinssatz = Zinssatz;



    }
}
