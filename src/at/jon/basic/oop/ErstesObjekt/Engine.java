package at.jon.basic.oop.ErstesObjekt;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; //Diese oder Benzin
    public int motor;
    public int speed;


    public Engine(int horsePower, TYPE type, int speed) {
        this.horsePower = horsePower;
        this.type = type;
        this.speed = speed;
    }



    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }
}
