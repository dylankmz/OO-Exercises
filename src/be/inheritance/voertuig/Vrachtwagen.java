package be.inheritance.voertuig;

public class Vrachtwagen extends Voertuig {

    private int maxLaadvermogen;
    private int huidigeLading;
    private boolean trailer;

    public Vrachtwagen(int maxLaadvermogen, boolean trailerofNiet) {
        this.maxLaadvermogen = maxLaadvermogen;
        this.trailer = trailer;
    }

    public Vrachtwagen() {

    }

    public int getMaxLaadvermogen() {
        return maxLaadvermogen;
    }

    public void setMaxLaadvermogen(int maxLaadvermogen) {
        this.maxLaadvermogen = maxLaadvermogen;
    }

    public int getHuidigeLading() {
        return huidigeLading;
    }

    public void setHuidigeLading(int huidigeLading) {
        this.huidigeLading = huidigeLading;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    //Methodes

    public boolean laden(double lading) {
        if (huidigeLading <= 0) {
            return false;
        }

        if ((huidigeLading + huidigeLading) <= maxLaadvermogen) {
            huidigeLading = huidigeLading + huidigeLading;
            return true;

        } return false;
    }

    public boolean lossen() {
        if (huidigeLading > 0) {
            huidigeLading = 0;
            return true;

        } return false;
    }

    @Override
    public String toString() {
        return "[Vrachtwagen: " + getMerk() + " " + getModel() + ", laadvermogen " + maxLaadvermogen + "T " + ", lading: " + huidigeLading + "T " + "]";
    }
}
