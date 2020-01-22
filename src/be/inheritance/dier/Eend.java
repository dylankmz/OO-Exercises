package be.inheritance.dier;

public class Eend extends Dier {

    public Eend(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println(this.getNaam() + ": Kwak");
    }
}
