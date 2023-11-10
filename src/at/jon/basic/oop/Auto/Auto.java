package at.jon.basic.oop.Auto;

public class Auto {
    private int iLeistung = 0;
    private String sFarbe = "Keine Farbe";

    private Fahrrad kofferraumfahhrad;
    private Getränkekiste kofferraumGetraenke;

    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public Fahrrad getKofferraumfahhrad() {
        return kofferraumfahhrad;
    }

    public void setKofferraumfahhrad(Fahrrad kofferraumfahhrad) {
        this.kofferraumfahhrad = kofferraumfahhrad;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public Getränkekiste getKofferraumGetraenke() {
        return kofferraumGetraenke;
    }

    public void setKofferraumGetraenke(Getränkekiste kofferraumGetraenke) {
        this.kofferraumGetraenke=kofferraumGetraenke;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }
}
