package be.oo.cirkel;

public class Main {

    public static void main(String[] args) {

        Cirkel c1 = new Cirkel();
        c1.setKleur("wit");
        c1.setStraal(0.0);
        Cirkel c2 = new Cirkel("blauw");
        c2.setStraal(5.5);
        c2.geefOmtrek();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("De omtrek van cirkel2 is: " + c2.geefOmtrek());



    }
}
