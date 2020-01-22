package be.bibliotheek.model;

public class Boek extends Item {

    private String isbn;
    private  String auteur;


    public Boek(long id, String titel, String genre, int aantal, int uitgeleend, String isbn, String auteur) {
        super(id, titel, genre, aantal, uitgeleend);
        this.isbn = isbn;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Boek: " + "isbn: " + isbn + ", auteur: " + auteur + ", " + "Aantal: " + getAantal() + ", Uitgeleend: " + getUitgeleend();
    }
}