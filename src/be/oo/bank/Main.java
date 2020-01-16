package be.oo.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bankrekening b1 = new Bankrekening(150);

        char keuze;
        do {
            System.out.println("Bankrekening Menu:");
            System.out.println("------------------");
            System.out.println("a: afhalen");
            System.out.println("b: storten");
            System.out.println("q: stoppen");
            System.out.println(b1.toString());
            System.out.println("Geef je keuze: ");
            keuze = sc.next().charAt(0);

            double bedrag;
            switch (keuze) {
                case 'a':
                case 'A':
                    System.out.println("Hoeveel wil je afhalen: ");
                    bedrag = sc.nextDouble();
                    b1.afhalen(bedrag);
                    break;
                case 'b':
                case 'B':
                    System.out.println("Hoeveel wil je storten: ");
                    bedrag = sc.nextDouble();
                    b1.storten(bedrag);
                    break;
                case 'q':
                case 'Q':
                    System.out.println("Bedankt voor uw bezoek!");
                    break;
                default:
                    System.out.println("Deze keuze bestaat niet, probeer opnieuw...");

            }
            } while (keuze != 'q');
        }

    }

