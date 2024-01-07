package at.jon.basic.oop.GeometrischeFiguren;

public class Würfel extends Figures {
    public Würfel(String name) {
        super(name);
    }

    public void Flächeninhalt(double Seitenlänge){
        double Flächeninhalt = Math.pow(Seitenlänge, 2) * 6;
        System.out.println("Der Flächeninhalt beträgt: " + Flächeninhalt + "LE^2");
    }
}
