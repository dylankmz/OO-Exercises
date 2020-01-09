package be.oo.leerling;

public class Leerling {

    private String naam;
    private int leerjaar;
    private int niveau;

    public Leerling(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeerjaar() {
        return leerjaar;
    }

    public void setLeerjaar(int leerjaar) {
        this.leerjaar = leerjaar;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void verhoogNiveau() {
        niveau++;
    }

    @Override
    public String toString() {
        return "Niveau van " + naam + " is momenteel: " + niveau;
    }
}
