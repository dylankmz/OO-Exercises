package be.inheritance.dier;

public class Slang extends Dier {

    public Slang(String naam) {
        super(naam);
    }

    public void vervel() {
        System.out.println(getNaam() + ": Ik vervel");
    }

    @Override
    public void maakGeluid() {
        System.out.println(getNaam() + ": sssssssss");
    }
}
