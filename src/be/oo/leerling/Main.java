package be.oo.leerling;

public class Main {

    public static void main (String[] args) {

        Leerling leerling1 = new Leerling("Jan");
        leerling1.setLeerjaar(1);
        leerling1.setNiveau(1);
        leerling1.verhoogNiveau();

        Leerling leerling2 = new Leerling("Piet");
        leerling2.setLeerjaar(2);
        leerling2.setNiveau(5);

        System.out.println(leerling1);
        System.out.println(leerling2);

    }




}
