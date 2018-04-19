package de.fallen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {

    public static final String EXIT = "exit";

    public static void main(final String[] args) throws IOException {
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isReader);
        Translator translator = new Translator();

        System.out.println(
            "Willkommen zum Fancy Zahlen-in-römische-Ziffern-Übersetzungstool!");
        System.out.println(
            "- Gib mir eine Zahl, um die entsprechende römische Zeichenfolge zu erhalten!");
        System.out.println("- Gib '" +
            EXIT +
            "' ein, um das Programm zu beenden.");
        System.out.println("Los geht's!");

        while (true) {
            System.out.println("###");
            System.out.println("Gib eine Zahl ein:");
            try {
                String input = br.readLine();

                if (EXIT.equals(input)) {
                    System.out.println(
                        "Programm wird beendet, Tschüssikowski!");
                    System.exit(0);
                }

                int i = Integer.parseInt(input);
                Optional<String> result = translator.translate(i);
                if (result.isPresent()) {
                    System.out.println("Die Zahl " +
                        i +
                        " lautet als römische Ziffer: " +
                        result.get());
                } else {
                    System.out.println(
                        "Kenne ich nicht, versuchs nochmal!");
                }
            } catch (NumberFormatException nfe) {
                System.out.println(
                    "Netter Versuch, aber du musst schon eine Zahl eingeben! Versuchs nochmal!");
            }
        }
    }

}
