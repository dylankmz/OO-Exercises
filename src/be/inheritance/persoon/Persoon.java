package be.inheritance.persoon;

public class Persoon {

    private static long aantalPersonen;
    private long id;
    private String naam;
    private String adres;

    public Persoon(String naam, String adres) {
        this.naam = naam;
        this.adres = adres;
        aantalPersonen++;
        this.id = aantalPersonen;
    }

    public Persoon() {
        this.naam = "onbekend";
        this.adres = "onbekend, België";
        aantalPersonen++;
        this.id = aantalPersonen;
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public static long getAantalPersonen() {
        return aantalPersonen;
    }

    @Override
    public String toString() {
        return "[Persoon: " + id + " " + naam + ", " + "[Adres: " + adres + "]]";
    }
}
