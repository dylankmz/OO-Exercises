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

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Docent d1 = new Docent();

        s1.setNaam("Vincent");
        s1.setSpecialisatie("Economie");
        s2.setNaam("Dylan");
        s2.setSpecialisatie("IT");
        s3.setNaam("Morgane");
        s3.setSpecialisatie("Talen");

        d1.setSpecialisatie("Muziek");
        d1.setNaam("Frans Lange");
        d1.voegStudent(s1);
        d1.voegStudent(s3);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(d1.toString());
    }
}
