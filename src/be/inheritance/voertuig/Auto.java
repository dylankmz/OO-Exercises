package be.inheritance.voertuig;

public class Auto extends Voertuig {

    public Auto(String merk, String model) {
        super(merk, model);
    }

    @Override
    public String toString() {
        return "[Auto: " + getMerk() + " " + getModel() + "]";
    }
}
