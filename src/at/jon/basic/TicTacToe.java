package at.jon.basic;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[][] field = new char[3][3];

        int Eingabe1 = 0;
        int Eingabe2 = 0;


        char cAbbruch;
        int Player1 = 0;
        int Player2 = 0;

        do {

            System.out.println("-------------------------");
            System.out.println("Willkommen bei TicTacToe!");
            System.out.println("Spieler 1 gib bitte deinen ersten Wert ein: ");
            Eingabe1 = scanner.nextInt();

            System.out.println("Spieler 2 gib bitte deinen ersten Wert ein: ");
            Eingabe2 = scanner.nextInt();




            System.out.println("Wollen Sie nochmal spielen oder das Spiel beenden? (n) oder (b)");
            cAbbruch = scanner.next().charAt(0);

        }while (cAbbruch != 'n');
    }
}
