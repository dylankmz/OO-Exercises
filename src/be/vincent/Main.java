package be.vincent;

public class Main {

    public static void main(String[] args) {


        Voertuig a1 = new Auto("BMW", "M3", "Benzine", "1TEL752", "4", "Vincent");
        Voertuig a2 = new Auto("Porsche", "911", "Benzine", "1HFB765", "4", "Firat");
        Voertuig b1 = new Bus("Volvo", "DeLijn", "Diesel", "1GDF321", "4", "Dylan");
        Voertuig m1 = new Moto("Yamaha", "Cross", "Benzine", "1HGK987", "2", "Key");
        Voertuig a3 = new Auto("Ferrari", "Rouge", "Benzine", "1HGJ762", "4", "Dylan");

        Garage ali = new Garage();
        ali.setGarageName("AliTutar");
        ali.setEmployee("Ali");

        ali.changeOil(a1);
        ali.addCar(a2);
        ali.printavailableCars();

        Garage memo = new Garage();
        memo.setGarageName("MemoCars");
        memo.setEmployee("Memo");

        memo.addCar(a3);
        memo.changeOil(a3);

        Garage behzat = new Garage();
        behzat.sellCar(a2);
        behzat.addCar(a1);

        behzat.printavailableCars();


        behzat.sellCar(a2);

    }
}
