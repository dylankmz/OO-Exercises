package be.collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> naamLijst = new ArrayList<>();
        boolean a = true;

        String keuze;

        while (a) {

            System.out.println("*** MENU ***");
            System.out.println("a. Ingeven van een bijkomende naam");
            System.out.println("b. Afdrukken van de huidige lijst");
            System.out.println("c. Bekijken van element van de lijst");
            System.out.println("q. Verlaat het programma");
            System.out.println("Voer uw keuze in: ");
            keuze = sc.next();
            switch (keuze) {

                case "a":
                    System.out.println("Geef uw gewenste naam in: ");
                    String naam = sc.next();
                    naamLijst.add(naam);
                    break;
                case "b":
                    System.out.println("De volledige lijst is: ");
                    System.out.println(naamLijst.toString());
                    break;
                case "c":
                    System.out.println("Welke element wilt u bekijken?: ");
                    int pos = sc.nextInt();
                    System.out.println(naamLijst.get(pos).toUpperCase());
                    break;
                case "q":
                    System.out.println("U verlaat het programma!");
                    a = false;
                    break;

                default:
                    System.out.println("Slecht keuze, probeer opnieuw!");
            }
        }
    }
}
