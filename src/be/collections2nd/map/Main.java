package be.collections2nd.map;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> zitplaatsen = new HashMap<>();

        zitplaatsen.put("Jan", 3);
        zitplaatsen.put("Frans", 6);
        zitplaatsen.put("Julie", 8);
        zitplaatsen.put("Anny", 1);
        printMap(zitplaatsen);

        zitplaatsen.put("Rik", 1);
        zitplaatsen.put("Fran", 2);
        zitplaatsen.put("Amou", 3);
        printMap(zitplaatsen);

    }

    public static void printMap(HashMap<String, Integer> map) {
        System.out.println("---Map---");
        for (String key: map.keySet()){
            System.out.println("Stoel " + key + ": " + map.get(key) );
        }
        System.out.println("---------");
    }
}
