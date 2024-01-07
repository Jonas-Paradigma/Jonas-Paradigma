package at.jon.basic.oop.Lampe;

public class test {
    public static void main(String[] args) {
        Glühelemente g1 = new Glühelemente("Lampe1", "Blau", 10, true);
        Glühelemente g2 = new Glühelemente("Lampe2", "Grün", 8, false);
        Glühelemente g3 = new Glühelemente("Lampe3", "Rot", 2, false);
        Glühelemente g4 = new Glühelemente("Lampe4", "Gelb", 13, true);

        Lampe l1 = new Lampe();
        l1.addLightElement(g1);
        l1.addLightElement(g2);
        l1.addLightElement(g3);
        l1.addLightElement(g4);

        l1.getOverallPowerUsage();
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
        g1.turnOn();

    }
}
