package be.inheritance.voertuig;

public class Main {

    public static void main (String[] args) {

        Auto a1 = new Auto();
        a1.setMerk("BMW");
        a1.setModel("M3");
        System.out.println(a1.toString());

        Bus b1 = new Bus();
        b1.setMerk("Volvo");
        b1.setModel("DeLijn");
        b1.setMaxAantalPassagiers(250);
        b1.setAantalPassagiers(200);
        System.out.println(b1.toString());

        Moto m1 = new Moto();
        m1.setMerk("Yamaha");
        m1.setModel("Cross");
        System.out.println(m1.toString());

        Vrachtwagen v1 = new Vrachtwagen();
        v1.setMerk("Volvo");
        v1.setModel("Truck");
        v1.setMaxLaadvermogen(30);
        v1.setHuidigeLading(25);
        System.out.println(v1.toString());
    }
}
