package at.jon.basic.oop.GeometrischeFiguren;

public class test {
    public static void main(String[] args) {
        Kreis k = new Kreis("Kreis1");
        k.Flächeninhalt(3);
        k.AusgabeName();

        Viereck v = new Viereck("Viereck1");
        v.Flächeninhalt(4,2);
        v.AusgabeName();

        Quadrat q = new Quadrat("Quadrat1");
        q.Flächeninhalt(5);
        q.AusgabeName();

        Würfel w = new Würfel("Würfel1");
        w.Flächeninhalt(2);
        w.AusgabeName();
    }
}
