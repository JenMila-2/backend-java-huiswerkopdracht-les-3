import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> numericAlpha = new HashMap<>();

        //Integer Array
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //String Array
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(numeric, alphabetic);

        boolean play = true;
        String ongeldig = "Ongeldige invoer!";
        Scanner scanner = new Scanner(System.in);

        while (play) {
            //Vraagt gebruiker om het programma te stoppen of het vertalen het starten
            System.out.println("Type 'x' om te stoppen");
            System.out.println("Type 'v' om te vertalen");
            String input = scanner.nextLine();

            if (Objects.equals(input, "x")) {
                play = false;
            } else if (Objects.equals(input, "v")) {
                //Is altijd true, vraagt gebruiker om cijfer in te typen
                System.out.println("Voer hier een cijfer tussen de 0 en 9 in.");
                int inputGrade = scanner.nextInt();
                scanner.nextLine();

                //Eerste block wordt alleen uitgevoerd als de gebruiker een geldige cijfer heeft ingevoerd
                //Tweede block wordt uitgevoerd als de gebruiker een ongeldige cijfer heeft ingevoerd
                //Derde block wordt uitgevoerd als de gebruiker iets anders dan 'v' of 'x' invoert
                if (inputGrade < 10) {
                    String result = translator.Translate(inputGrade);
                    System.out.println("De vertaling van " + inputGrade + " is " + result);
                } else {
                    System.out.println(ongeldig);
                    System.out.println("Voer opnieuw een 'v' in en vervolgens een cijfer tussen de 0 en 9.");
                }
            } else {
                System.out.println(ongeldig + " Type een 'v' of een 'x' in.");
            }
        }

    }
}
