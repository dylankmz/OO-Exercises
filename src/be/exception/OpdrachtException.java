package be.exception;

public class OpdrachtException {


    public static void main(String[] args) {

        Sorteerder sorteerder = new Sorteerder();

        try {
            sorteerder.alfabetish("Vincent", "Dylan");
        } catch (GeenWoordException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }



}
