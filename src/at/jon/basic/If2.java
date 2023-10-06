package at.jon.basic;

import java.net.SocketOption;
import java.util.Random;

public class If2 {
    public static void main(String[] args) {

            // Erstelle eine Zufallszahl zwischen 0 und 100
            Random random = new Random();
            int Zahl = random.nextInt(100);
            int Zahl2 = random.nextInt(100);

            // Erstelle zwei Zufallszahl zwischen 0 und 100


            // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
            // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

        if ((Zahl < Zahl2) && (Zahl < 50)){
            System.out.print("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

            // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
            // dann gib aus "Eine der beiden ist kleiner als 30"

        if ((Zahl < 30) || (Zahl2 < 30)) {
            System.out.print("Eine der beiden ist kleiner als 30");
        }

            // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
            // dann gib aus "Erste Zahl klein, zweite kein 50iger"

        if((Zahl < 50) && (Zahl2 != 50)) {
            System.out.print(" Erste Zahl klein, zweite kein 50iger");
        }



        }




    }

