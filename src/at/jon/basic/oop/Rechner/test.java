package at.jon.basic.oop.Rechner;

public class test {
    public static void main(String[] args) {
        NormalaRechner r1 = new NormalaRechner();
        r1.Addition(5, 4);
        r1.Differenz(7,2);
        r1.Multiplikation(2, 3);
        r1.Division(8, 2);

        Wissenschaftrechna w1 = new Wissenschaftrechna();
        w1.Sinus(70);
        w1.Cosinus(6);


        Wurzelrechna wur1 = new Wurzelrechna();
        wur1.Wurzel(25);
    }
}
