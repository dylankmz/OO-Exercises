package be.inheritance.persoon;

public class Student extends Persoon {

    private String specialisatie;

    public String veranderSpecialisatie() {
        return veranderSpecialisatie();
    }

    @Override
    public String toString() {
        return "[Student " + getId() + ": " + getNaam() + " ," + "specialisatie: " + specialisatie;
    }
}
