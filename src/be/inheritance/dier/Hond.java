package be.inheritance.dier;

public class Hond extends Dier {

    public Hond(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println(this.getNaam() + ": Waf");
    }
}
