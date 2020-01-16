package be.oo.bank;

public class Bankrekening {

    private double bedrag;

    public Bankrekening() {
        this.bedrag = 0.0;
    }

    public Bankrekening(double bedrag) {
        this();
        if (bedrag > 0) {
            this.bedrag = bedrag;
        }
    }

    public void storten(double bedrag) {
        if (bedrag >= 0) {
            this.bedrag = bedrag + bedrag;
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

    public double getBedrag() {
        return bedrag;
    }

    private void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    @Override
    public String toString() {
        return "Bankrekening bedrag: " + this.bedrag;
    }
}