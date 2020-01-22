package be.bibliotheek.model;

public class Main {

    public static void main(String[] args) {

        Bibliotheek x = new Bibliotheek();

        Boek b1 = new Boek(1, "HarryPotter", "Fiction", 5, 1, "1", "JK Rowling");
        Boek b2 = new Boek(2, "Simpsons", "Kids", 5, 3, "2", "MattGroening");
        Game g1 = new Game(3, "TheLastofUs", "Horror", 10, 7, "NaughtyDogs", 10);

        x.items.add(b1);
        x.items.add(b2);
        x.items.add(g1);

        Uitleenbaar.leenUit(x, b1);

        System.out.println(b1);
    }


}
