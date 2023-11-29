package at.jon.basic.oop.ErstesObjekt;

public class Car {

    private Engine engine;
    private int horsePower;
    private int fuelcosumption;
    private double fuelamount;
    private String brand;
    private String serialnumber;
    private String color;
    private String turboboost;
    private int maxfuelamount;
    private String honk;
    private int amountOfRepititions;
    private double getRamainingRange;
    private double fuelconsumptionperkilometer;


    public Car(int horsePower,Engine engine, String brand, String serialnumber){
        this.horsePower = horsePower;
        this.engine = engine;
        this.brand = brand;
        this.serialnumber = serialnumber;
    }



    //Methode
    public void drive() {
        this.fuelamount = this.fuelamount - this.fuelcosumption;
        System.out.println("I am driving");
    }

    public void bremsen() {
        System.out.println("Ich bremse");
    }

    public void turboboost(){
        if(fuelamount >= 0.1 * maxfuelamount) {
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk() {
        for (int i = 0; i < amountOfRepititions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRamainingRange() {
        this.getRamainingRange = this.fuelamount / this.fuelconsumptionperkilometer;
        System.out.println("Die Maximaldistanz betraegt: " + getRamainingRange + " km.");
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelcosumption(int fuelcosumption) {
        this.fuelcosumption = fuelcosumption;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelcosumption() {
        return fuelcosumption;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

}
