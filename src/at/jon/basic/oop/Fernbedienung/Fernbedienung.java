package at.jon.basic.oop.Fernbedienung;

import java.util.List;
import java.util.ArrayList;


public class Fernbedienung {
    private String fernbedienung;
    private String marke;
    private boolean on;
    private int hasPower;
    private List<Battery> batterien;


    public Fernbedienung(String marke) {
        this.marke = marke;
        this.batterien = new ArrayList<>();
    }

    public void turnOn(){
        if (on == false) {
            on = true;
            for (int i = 0; i < batterien.size(); i++) {
                int neuerAkku = batterien.get(i).getStatus() - 5;
                batterien.get(i).setStatus(neuerAkku);
            }
            System.out.println("Verbraucher angeschlossen");
        } else {
            System.out.println("Bereits eingeschaltet");
        }
    }

    public void turnOff(){
        if (on == true) {
            on = false;
            System.out.println("Kein Verbraucher angeschlossen");
        } else {
            System.out.println("Bereits ausgeschaltet");
        }
    }

    public void getStatus(){
        int Summe = 0;
        for (int i = 0; i < batterien.size(); i++) {
            Summe += batterien.get(i).getStatus();
        }
        setHasPower(Summe / batterien.size());
        System.out.println("Die erste Batterie hat " + getBatterien().get(0).getStatus() + "% Akku\nDie zweite Batterie hat " + getBatterien().get(1).getStatus() + "% Akku\nDer Mittelwert der Akkus beträgt " + hasPower + "%");
    }

    public void addBattery(Battery batterien){
        this.batterien.add(batterien);
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getHasPower() {
        return hasPower;
    }

    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }

    public List<Battery> getBatterien() {
        return batterien;
    }

    public void setBatterien(List<Battery> batterien) {
        this.batterien = batterien;
    }

    public String getFernbedienung() {
        return fernbedienung;
    }

    public void setFernbedienung(String fernbedienung) {
        this.fernbedienung = fernbedienung;
    }
}



