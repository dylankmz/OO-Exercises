package be.oo.cirkel;

public class Cirkel {

   private double straal;
   private String kleur;

    public Cirkel() {
    }

    public Cirkel(String kleur) {
        this.kleur = kleur;
        this.straal = 0;
    }

    public Cirkel(double straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }




    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte(double straal) {
        return Math.PI * straal * straal;
    }





    @Override
    public String toString() {
        return "De kleur van de cirkel is " + kleur + " en de straal van de cirkel " + straal;
    }

}
