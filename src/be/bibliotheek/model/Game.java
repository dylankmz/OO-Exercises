package be.bibliotheek.model;

public class Game extends Item {

    private String publisher;
    private int rating;

    public Game(long id, String titel, String genre, int aantal, int uitgeleend, String publisher, int rating) {
        super(id, titel, genre, aantal, uitgeleend);
        this.publisher = publisher;
        this.rating = rating;
    }


}
