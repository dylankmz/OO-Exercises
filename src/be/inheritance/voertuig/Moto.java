package be.inheritance.voertuig;

public class Moto extends Voertuig {

    @Override
    public String toString() {
        return "[Moto: " + getMerk() + " " + getModel() + "]";
    }
}
