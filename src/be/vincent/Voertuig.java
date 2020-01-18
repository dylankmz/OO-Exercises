package be.vincent;

//Door de klasse abstract te maken zorgen we ervoor dat we van die klasse geen object kunnen maken.
public abstract class Voertuig {

    //Hier applikeer ik de encapsulation, mijn attributen zijn accesible met getters en setters.
    private String merk;
    private String model;
    private String brandstof;
    private String plaque;
    private String aantalWielen;
    private String klant;


    public Voertuig(String merk, String model, String brandstof, String plaque, String aantalWielen, String klant) {
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

    public String getAantalWielen() {
        return aantalWielen;
    }

    public void setAantalWielen(String aantalWielen) {
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
        return "Voertuig{" + "merk='" + merk + '\'' +
                ", model='" + model + '\'' +
                ", brandstof='" + brandstof + '\'' +
                ", plaque='" + plaque + '\'' +
                ", aantalWielen='" + aantalWielen + '\'' +
                ", klant='" + klant + '\'' +
                '}';
    }
}
