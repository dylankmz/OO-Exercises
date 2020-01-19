package be.packaging.bib.model;

public class Game extends Item {

    private String publisher;
    private int rating;

    public Game(long id, String titel, String genre, int aantal, int uitgeleend, String publisher, int rating) {
        super(id, titel, genre, aantal, uitgeleend);
        this.publisher = publisher;
        this.rating = rating;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

