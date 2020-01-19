package be.packaging.bib.model;


public class Main {

    public static void main(String[] args) {

        Bibliotheek b1 = new Bibliotheek();

        Item i1 = new Boek(1, "HarryPotter", "Magie", 3, 2);
        Item i2 = new Boek(2, "Simpsons", "Comedie", 4, 1);
        Item g1 = new Game(3, "LastOfUs", "Horror", 5, 3, "NaughtyDog", 9);

        Item[] items = new Item[]{i1, i2, g1};

        b1.setItems(items);

        for (int i = 0; i < b1.getItems().length; i++) {
            System.out.println(b1.getItems()[i].leenUIt());
        }
    }
}
