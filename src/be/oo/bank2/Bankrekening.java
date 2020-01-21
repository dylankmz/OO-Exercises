package be.oo.bank2;

public class Bankrekening {

    private double bedrag;

    public Bankrekening() {
        this.bedrag = 0.0;
    }

    public Bankrekening(double bedrag) {
        if (bedrag < 0) {
            bedrag = 0;
        }
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public void storten(double bedrag) {
        if (bedrag >= 0) {
            this.bedrag = getBedrag() + bedrag;
        }
    }

    public void afhalen(double afteHalenBedrag) {
        if (afteHalenBedrag < 0) {
            return;
        }
        if (this.bedrag - afteHalenBedrag >= -1000) {
            this.bedrag = bedrag - afteHalenBedrag;
        }

    }

    @Override
    public String toString() {
        return "Bankrekening: " + bedrag;
    }
}
