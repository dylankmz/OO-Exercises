package be.finalexercise;

public class Voertuig {

    private String merk;
    private String model;
    private String brandstof;
    private String plaque;
    private int aantalWielen;
    private String klant;

    public Voertuig() {
    }

    public Voertuig(String merk, String model, String brandstof, String plaque, int aantalWielen, String klant) {
        this.merk = merk;
        this.model = model;
        this.brandstof = brandstof;
        this.plaque = plaque;
        this.aantalWielen = aantalWielen;
        this.klant = klant;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public int getAantalWielen() {
        return aantalWielen;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public String getKlant() {
        return klant;
    }

    public void setKlant(String klant) {
        this.klant = klant;
    }

    @Override
    public String toString() {
        return "Voertuig: " + merk + " " + model + ", " + brandstof + ", " + plaque + ", " + "Aantal wielen: " + aantalWielen + ", " + klant;
    }
}
