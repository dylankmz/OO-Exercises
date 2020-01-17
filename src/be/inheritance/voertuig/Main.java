package be.inheritance.voertuig;

public class Main {

    public static void main (String[] args) {

        Auto a1 = new Auto("BMW","M3");

        System.out.println(a1.toString());

        Bus b1 = new Bus("Volvo", "DeLijn", 50, 20);
        b1.setMaxAantalPassagiers(250);
        b1.setAantalPassagiers(200);
        System.out.println(b1.toString());

        Moto m1 = new Moto("Yamaha", "Cross");
        System.out.println(m1.toString());

        Vrachtwagen v1 = new Vrachtwagen("Volvo", "Truck", 30, 25, true);
        System.out.println(v1.toString());

        Voertuig v2 = new Voertuig("Volvo", "AERT");
        System.out.println(v2.toString());
    }
}
