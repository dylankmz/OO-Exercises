package be.inheritance.dier;

public class Main {

    public static void main(String[] args) {

        Dier d1 = new Hond("Lassie");
        Dier d2 = new Kat("Esther");
        Dier d3 = new Eend("Ducky");
        Dier d4 = new Slang("Sissy");

        Kat d5 = new Huiskat("Ludo");
        d5.vangMuis();
        Kat d6 = new Wildekat("Cindy");
        d6.vangMuis();
        d2.maakGeluid();
        d3.maakGeluid();
        d1.maakGeluid();
        ((Slang) d4).vervel();


    }
}
