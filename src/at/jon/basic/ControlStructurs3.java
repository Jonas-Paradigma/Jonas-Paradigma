package at.jon.basic;

import java.net.SocketOption;
import java.util.Random;

public class ControlStructurs3 {

        public static void main(String[] args) {
            // Erstelle eine Zufallszahl zwischen 0 und 100
            Random random = new Random();
            int randomNumber = random.nextInt(100);


           if(randomNumber < 20) {
               System.out.println(randomNumber);
               System.out.print("Mini");

            }else if ((randomNumber > 20) && (randomNumber < 50)){
                System.out.println(randomNumber);
                System.out.print("Medium");

            }else if (randomNumber > 50){
                System.out.println(randomNumber);
                System.out.print("Large");
            }

        }
    }


