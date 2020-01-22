package be.inheritance.dier;

public class Kat extends Dier {

    public Kat(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println(this.getNaam() + ": Miauw");
    }

    public void vangMuis() {
        System.out.println(getNaam() + ": muis gevangen!");
    }
}
