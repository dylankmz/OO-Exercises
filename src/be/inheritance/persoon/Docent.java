package be.inheritance.persoon;

import java.util.Arrays;

public class Docent extends Persoon {

    private String specialisatie;

    private String[] studenten = new String[20];
    private int numberofItems = studenten.length;

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public String[] getStudenten() {
        return studenten;
    }

    public void setStudenten(String[] studenten) {
        this.studenten = studenten;
    }

    public int getNumberofItems() {
        return numberofItems;
    }

    public void setNumberofItems(int numberofItems) {
        this.numberofItems = numberofItems;
    }

    public void voegStudent(String[] studenten) {
        for (int i = 0; i < numberofItems ; i++) {
            String name = studenten[i];
        }
    }

    @Override
    public String toString() {
        return "[Docent " + getId() + " " + getNaam() + ", " + "specialisatie: " + specialisatie + ", " + "(studenten: " + studenten + " )]";
    }
}
