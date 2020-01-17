package be.inheritance.voertuig;

public class Bus extends Voertuig{

    private int maxAantalPassagiers;
    private int aantalPassagiers;

    public Bus(int maxAantalPassagiers) {
        this.maxAantalPassagiers = maxAantalPassagiers;
    }

    public Bus() {

    }

    public int getMaxAantalPassagiers() {
        return maxAantalPassagiers;
    }

    public void setMaxAantalPassagiers(int maxAantalPassagiers) {
        this.maxAantalPassagiers = maxAantalPassagiers;
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        aantalPassagiers = aantalPassagiers;
    }

    //Methodes

    public boolean opStappen() {
        if (aantalPassagiers < maxAantalPassagiers) {
            aantalPassagiers++;
            return true;

        } return false;
    }

    public boolean afStappen() {
        if (aantalPassagiers > 0) {
            aantalPassagiers--;
            return true;

        } return false;
    }

    @Override
    public String toString() {
        return "[Bus: " + getMerk() + " " + this.getModel() + ", passagiers max" + maxAantalPassagiers + ": " + aantalPassagiers + "]";
    }
}
