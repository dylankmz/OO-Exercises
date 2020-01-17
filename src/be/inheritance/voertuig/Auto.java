package be.inheritance.voertuig;

public class Auto extends Voertuig {

    @Override
    public String toString() {
        return "[Auto: " + getMerk() + " " + getModel() + "]";
    }
}
