package be.bibliotheek.model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheek {

    List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
