package at.jon.basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankautomatBeispiel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double dKonto = 0;
        double dEinzahlen = 0;
        double dAbheben = 0;
        char cAbbruch = 'a';


        do {

            System.out.println("Menü:");
            System.out.println("Drücken Sie 1 zum Einzahlen");
            System.out.println("Drücken Sie 2 zum Abheben");
            System.out.println("Drücken Sie 3 um ihren Kontostand zu sehen");
            System.out.println("Drücken Sie 4 zum Beenden");
            System.out.println("-------------------------");


            double dEingabe = scanner.nextDouble();


            if (dEingabe == 1) {
                System.out.println("Wie viel wollen Sie einzaheln?");
                dEinzahlen = scanner.nextDouble();

                dKonto = dKonto + dEinzahlen;

            } else if (dEingabe == 2) {
                System.out.println("Wie viel wollen Sie abheben?");
                dAbheben = scanner.nextDouble();

                dKonto = dKonto - dAbheben;

            } else if (dEingabe == 3) {
                System.out.println("Ihr Kontostand lautet: " + dKonto);

            } else if (dEingabe == 4) {
                System.out.println("Wollen Sie das Programm beenden? Wenn Ja drücken sie: J sonst: N");
                cAbbruch = scanner.next().charAt(0);
            }

        }while(cAbbruch != 'J');
        System.out.println("Beendet");
    }
}
