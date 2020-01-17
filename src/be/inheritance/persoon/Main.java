package be.inheritance.persoon;

public class Main {

    public static void main(String[] args) {

        Persoon p1 = new Persoon();
        p1.getNaam();
        p1.getAdres();
        System.out.println(p1.toString());

        Persoon p2 = new Persoon();
        p2.setNaam("Dylan Karapekmez");
        p2.setAdres("Vilvoorde, België");
        System.out.println(p2.toString());
    }
}
