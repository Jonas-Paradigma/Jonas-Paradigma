package at.jon.basic.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TFaker {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertdata.txt");

            Date currentDate = null;
            for (int i = 1; i <= 100; i++) {
                currentDate = new Date();
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                String streetAddress = faker.address().streetAddress();


                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

                // Format the date to a string
                String formattedDate;
                formattedDate = dateFormat.format(currentDate);


                String dataEntry = "insert into Kunden (KundenID, Vorname, Nachname, Geburtsdatum, Adresse) values(" + i + ",' " + firstName + "','" + lastName + "','" + formattedDate + "','" + streetAddress + "'" +");";
                myWriter.write(dataEntry + "\n");
            }


                    Faker faker1 = new Faker(new Locale("DE-AT"));

                    try {
                        FileWriter myWriter1 = new FileWriter("insertdata_ausruestung.txt");

                        for (int i = 1; i <= 100; i++) {
                            String bezeichnung = faker.beer().name();
                            String kategorie = faker.beer().style();
                            boolean verfuegbar = faker.random().nextBoolean();


                            String dataEntry = "insert into Ausruestung (AusruestungsID, Bezeichnung, Kategorie, Verfuegbar) values(" + i + ",' " + bezeichnung + "','" + kategorie + "'," + verfuegbar +  ");";
                            myWriter.write(dataEntry + "\n");
                        }

                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }





            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
