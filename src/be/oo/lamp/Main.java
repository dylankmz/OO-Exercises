package be.oo.lamp;

public class Main {

    public static void main (String[] args) {

        Lamp l1 = new Lamp();
        l1.setMerk("Osram");
        l1.setVermogen(30);

        System.out.println(l1.toString());
    }

}
