package at.jon.basic.oop.GeometrischeFiguren;

public class Quadrat extends Figures {

    public Quadrat(String name) {
        super(name);
    }

    public void Flächeninhalt(double Seitenlänge){
        double Flächeninhalt = Math.pow(Seitenlänge, 2);
        System.out.println("Der Flächeninhalt beträgt: " + Flächeninhalt + "LE^2");
    }
}
