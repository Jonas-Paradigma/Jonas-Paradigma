package at.jon.basic.oop.Konto;

public class Basiskonto {
    private String Hersteller;
    private String Kartenname;
    private int Kartennummer;
    private String IBAN;
    private double Kontostand;


    public void Einzahlen(double Einzahlung){
        System.out.println("Es wurden " + Einzahlung + " eingezahlt.");
        double NeuerKontostand = getKontostand() + Einzahlung;
        setKontostand(NeuerKontostand);
    }

    public void Auszahlen(double Auszahlung){
        System.out.println("Es wurden " + Auszahlung + " ausgezahlt.");
        double NeuerKontostand = getKontostand() - Auszahlung;
        setKontostand(NeuerKontostand);
    }

    public void Saldo(){
        System.out.println("Der Saldo beträgt: " + getKontostand());
    }

    public Basiskonto(String hersteller, String kartenname, int kartennummer, String IBAN, double kontostand) {
        this.Hersteller = hersteller;
        this.Kartenname = kartenname;
        this.Kartennummer = kartennummer;
        this.IBAN = IBAN;
        this.Kontostand = kontostand;

    }
    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public String getKartenname() {
        return Kartenname;
    }

    public void setKartenname(String kartenname) {
        Kartenname = kartenname;
    }

    public int getKartennummer() {
        return Kartennummer;
    }

    public void setKartennummer(int kartennummer) {
        Kartennummer = kartennummer;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getKontostand() {
        return Kontostand;
    }

    public void setKontostand(double kontostand) {
        Kontostand = kontostand;
    }



}
