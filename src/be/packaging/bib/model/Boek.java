package be.packaging.bib.model;

public class Boek extends Item {

    public Boek(long id, String titel, String genre, int aantal, int uitgeleend) {
        super(id, titel, genre, aantal, uitgeleend);
    }

    private String isbn;
    private String auteur;

    public Boek(long id, String titel, String genre, int aantal, int uitgeleend, String isbn, String auteur) {
        super(id, titel, genre, aantal, uitgeleend);
        this.isbn = isbn;
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
