package at.jon.basic.oop.GeometrischeFiguren;

public class Kreis extends Figures {

    public Kreis(String name) {
        super(name);
    }

    public void Flächeninhalt(double Radius){
        double Flächeninhalt = (Radius * 2) * Math.PI;
        System.out.println("Der Flächeninhalt beträgt: " + Flächeninhalt + "LE^2");
    }
}
