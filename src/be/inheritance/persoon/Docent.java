package be.inheritance.persoon;

public class Docent extends Persoon {

    private String specialisatie;

    private Student[] studenten = new Student[20];

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public Student[] getStudenten() {
        return studenten;
    }

    public void setStudenten(Student[] studenten) {
        this.studenten = studenten;
    }

    public void voegStudent(Student student) {
        for (int i = 0; i < studenten.length; i++) {
            if (studenten[i] == null) {
                studenten[i] = student;
                break;
            }
        }
    }

    public String getStudentName() {
        StringBuilder studentenName = new StringBuilder();
        for (int i = 0; i < studenten.length; i++) {
            if (studenten[i] != null) {
                studentenName.append(studenten[i].getNaam() + ", ");
            }
        }
        String name;
        return name = studentenName.substring(0, studentenName.lastIndexOf(","))+".";
    }

    @Override
    public String toString() {

        return "[Docent " + getId() + " " + getNaam() + ", " + "specialisatie: " + specialisatie + ", " + "(studenten: " + getStudentName().toString() + " )]";
    }
}
