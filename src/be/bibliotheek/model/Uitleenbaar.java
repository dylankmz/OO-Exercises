package be.bibliotheek.model;

public interface Uitleenbaar {

    public static boolean leenUit(Bibliotheek bibliotheek, Item item) {
        for (int i = 0; i < bibliotheek.items.size(); i++) {
            if (bibliotheek.items.get(i) == item) {
                item.setUitgeleend(item.getUitgeleend()+1);
                item.setAantal(item.getAantal()-1);
                System.out.println("Item met succes uitgeleend!");
            }
            return true;
        }
        return false;
    }

    public static void brengTerug(Bibliotheek bibliotheek, Item item) {
        int x = item.getUitgeleend();
        for (int i = 0; i < bibliotheek.items.size() ; i++) {
            if (bibliotheek.items.get(i) == item) {
                item.setUitgeleend(x++);
                System.out.println("Item met succes teruggebracht!");
            }
        }
    }
}
