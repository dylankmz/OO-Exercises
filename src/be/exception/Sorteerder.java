package be.exception;

public class Sorteerder {


    public boolean alfabetish(String woord1, String woord2) throws GeenWoordException {

        if (woord1 == null || woord2 == null) {
            throw new GeenWoordException("Geen Woord Mee gegeven in de parameter van de methode ");
        }

        if (woord1.charAt(0) > woord2.charAt(0)) {
            System.out.println("woord2 komt eerst in de alfabet");
            return false;

        } else
            System.out.println("woord1 komt eerst in de alfabet");
        return true;
    }
}
