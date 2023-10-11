package at.jon.basic;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        Random random = new Random();


        char cAbbruch;
        do {

            Scanner scanner = new Scanner(System.in);
            int winsofComputer = 0;
            int winsofPlayer = 0;
            int amountofDraws = 0;
            cAbbruch = 'n';

            for (int i = 0; i < 6; i++) {
                int randomPlayer = random.nextInt(6) + 1;
                int randomComputer = random.nextInt(6) + 1;


                System.out.println(" Compi: " + randomComputer + " Player: " + randomPlayer);

                if (randomPlayer > randomComputer) {
                    winsofPlayer++;
                } else if (randomPlayer < randomComputer) {
                    winsofComputer++;
                } else {
                    amountofDraws++;
                }

            }
            System.out.println("Computer: " + winsofComputer);
            System.out.println("Player: " + winsofPlayer);
            System.out.println("Draws: " + amountofDraws);

            if (winsofComputer > winsofPlayer) {
                System.out.println("Computer wins!");
            } else if (winsofComputer < winsofPlayer) {
                System.out.println("Player wins!");
            } else {
                System.out.println("It's a Draw!");
            }


            System.out.println("Wollen Sie das Spiel wiederholen?");
            cAbbruch = scanner.next().charAt(0);

        } while (cAbbruch == 'j');
        System.out.println("Spiel beendet!");

    }
}
