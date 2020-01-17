package be.inheritance.persoon;

public class Student extends Persoon {

    private String specialisatie;

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public String veranderSpecialisatie() {
        return veranderSpecialisatie();
    }

    @Override
    public String toString() {
        return "[Student " + getId() + ": " + getNaam() + " ," + "specialisatie: " + specialisatie;
    }
}
