package at.jon.basic;

import java.util.Random;

public class ForLoop {

    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        for(int i = 0; i <= 100; i++){
            System.out.print("Die Zahl " + i);
            System.out.println();
        }





    }
}
