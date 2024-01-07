package at.jon.basic.oop.GeometrischeFiguren;

import javax.xml.namespace.QName;

public class Figures {
    private String Name;

    public Figures(String name){
        this.Name = name;
    }

    public void Flächeninhalt(){
        double Flächeninhalt = 0;
        System.out.println("Der Flächeninhalt beträgt: " + Flächeninhalt + "LE^2");
    }

    public void AusgabeName(){
        System.out.println("Der Name der Figur lautet: " + getName());

    }
    private String getName() {
        return Name;
    }
}
