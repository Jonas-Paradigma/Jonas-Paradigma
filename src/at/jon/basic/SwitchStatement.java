package at.jon.basic;

import java.sql.SQLOutput;
import java.util.Random;
public class SwitchStatement {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(11 - 5) + 5;


        System.out.print(randomNumber);
        System.out.println();

        switch(randomNumber){
            case 10:
                System.out.print("Ten");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 5:
                System.out.print("Five");
                break;
        }
        // Erstelle eine Zufallszahl zwischen 5 und 10

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.


    }
}


