package be.bibliotheek.model;

public abstract class Item implements Uitleenbaar {

    private long id;
    private String titel;
    private String genre;
    private int aantal;
    private int uitgeleend;

    public Item(long id, String titel, String genre, int aantal, int uitgeleend) {
        this.id = id;
        this.titel = titel;
        this.genre = genre;
        this.aantal = aantal;
        this.uitgeleend = uitgeleend;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public int getUitgeleend() {
        return uitgeleend;
    }

    public void setUitgeleend(int uitgeleend) {
        this.uitgeleend = uitgeleend;
    }
}
