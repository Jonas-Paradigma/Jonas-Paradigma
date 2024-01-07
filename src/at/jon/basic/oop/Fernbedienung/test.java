package at.jon.basic.oop.Fernbedienung;

public class test {
    public static void main(String[] args) {
        Battery B1 = new Battery(50);
        Battery B2 = new Battery(60);

        Fernbedienung fernbedienung = new Fernbedienung("Loewe");
        fernbedienung.addBattery(B1);
        fernbedienung.addBattery(B2);

        fernbedienung.turnOn();
        fernbedienung.turnOff();
        fernbedienung.getStatus();
    }
}

