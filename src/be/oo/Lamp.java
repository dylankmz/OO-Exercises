package be.oo;

public class Lamp {

    private String merk;
    private int vermogen;

    public Lamp() {

    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getVermogen() {
        return vermogen;
    }

    public void setVermogen(int vermogen) {
        this.vermogen = vermogen;
    }

    @Override
    public String toString() {
        return "Kenmerken van de lamp: " + merk + '-' + vermogen + " Watt";
    }
}
