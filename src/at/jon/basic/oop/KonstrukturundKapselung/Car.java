package at.jon.basic.oop.KonstrukturundKapselung;

public class Car {
    public int fuelcosumption;

    public double fuelamount;

    public String brand;

    public String serialnumber;

    public String color;

    public String turboboost;
    public int maxfuelamount;

    public String honk;
    public int amountOfRepititions;

    public double getRamainingRange;
    public double fuelconsumptionperkilometer;








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
}

