package be.oo.bank2;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char keuze = '?';

        Bankrekening b1 = new Bankrekening(150);

        boolean a = true;

        while (a) {

            System.out.println("Bankrekening Menu:");
            System.out.println("------------------");
            System.out.println("a: afhalen");
            System.out.println("b: storten");
            System.out.println("q: stoppen");
            System.out.println(b1.toString());
            System.out.println("Wat is uw keuze?");
            keuze = sc.next().charAt(0);

            switch (keuze) {
                case 'a':
                    System.out.println("Hoeveel wilt u afhalen?");
                    double bedrag = sc.nextDouble();
                    b1.afhalen(bedrag);
                    b1.toString();
                    break;
                case 'b':
                    System.out.println("Hoeveel wilt u storten?");
                    bedrag = sc.nextDouble();
                    b1.storten(bedrag);
                    b1.toString();
                    break;
                case 'q':
                    System.out.println("Bedankt voor uw bezoek!");
                    a = false;
                    break;
                default:
                    System.out.println("Deze keuze bestaat niet, probeer opnieuw!");
            }
        }
    }
}
