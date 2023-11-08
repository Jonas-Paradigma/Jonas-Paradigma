package at.jon.basic.oop.Auto;

import at.jon.basic.oop.Auto.Flasche;

public class Getränkekiste {
    private int ianzahl;
    private Flasche flasche;


    public Getränkekiste(int ianzahl, Flasche flasche) {
        this.ianzahl = ianzahl;
        this.flasche = flasche;
    }

    public int getIanzahl() {
        return ianzahl;
    }

    public void setIanzahl(int ianzahl) {
        this.ianzahl = ianzahl;
    }

    public Flasche getFlasche() {
        return flasche;
    }

    public void setFlasche(Flasche flasche) {
        this.flasche = flasche;
    }
}
