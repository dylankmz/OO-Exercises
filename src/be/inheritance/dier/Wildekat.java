package be.inheritance.dier;

public final class Wildekat extends Kat{

    public Wildekat(String naam) {
        super(naam);
    }

    @Override
    public void vangMuis() {
        System.out.println(getNaam() + ": muis gevangen en opgegeten!");
    }
}
