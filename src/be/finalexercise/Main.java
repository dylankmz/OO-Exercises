package be.finalexercise;

public class Main {

    public static void main(String[] args) {

        Auto a1 = new Auto();
        a1.setMerk("BMW");
        a1.setModel("M3");
        a1.setAantalWielen(4);
        a1.setBrandstof("Benzine");
        a1.setPlaque("1TEL752");
        a1.setKlant("Dylan K.");
        System.out.println(a1.toString());

        Bus b1 = new Bus();
        b1.setMerk("Volvo");
        b1.setModel("XD");
        b1.setAantalWielen(4);
        b1.setBrandstof("Diesel");
        b1.setPlaque("1TJD645");
        b1.setKlant("De Lijn.");
        System.out.println(b1.toString());

        Garage ali = new Garage();
        ali.addCar(a1);
        ali.changeOil(a1);
    }

}
