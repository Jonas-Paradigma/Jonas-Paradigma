package at.jon.basic.oop.GeometrischeFiguren;

public class Viereck extends Figures{
    public Viereck(String name) {
        super(name);
    }

    public void Flächeninhalt(double a, double b){
        double Flächeninhalt = a * b;
        System.out.println("Der Flächeninhalt beträgt: " + Flächeninhalt + "LE^2");
    }
}
