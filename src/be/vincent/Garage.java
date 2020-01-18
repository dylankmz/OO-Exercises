package be.vincent;

public class Garage {

    //InstanceVariabelen (een unieke variabele voor het object dat je maakt)
    private String employee;
    private String garageName;

    //Statischevariabele is een variabele die behoort tot de klasse (het is een variabele die geschakeld is aan de klasse)
    private static Voertuig[] tekoopVoertuig = new Voertuig[50];
    private Voertuig[] tereparerenVoertuig;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public static Voertuig[] getTekoopVoertuig() {
        return tekoopVoertuig;
    }

    public static void setTekoopVoertuig(Voertuig[] tekoopVoertuig) {
        Garage.tekoopVoertuig = tekoopVoertuig;
    }

    public Voertuig[] getTereparerenVoertuig() {
        return tereparerenVoertuig;
    }

    public void setTereparerenVoertuig(Voertuig[] tereparerenVoertuig) {
        this.tereparerenVoertuig = tereparerenVoertuig;
    }

    public void changeOil(Voertuig voertuig) {
        System.out.println("Your oil is changed, " + "thanks " + voertuig.getKlant() + "!");
    }

    public void addCar(Voertuig voertuig) {
        boolean carIsAdded = false;

        for (int i = 0; i < tekoopVoertuig.length; i++) {
            if (tekoopVoertuig[i] == null) {
                tekoopVoertuig[i] = voertuig;
                carIsAdded = true;
                System.out.println("Car is added to stock!");
                break;

            }
        }
        if (carIsAdded == false) {
            System.out.println("No place available in stock");
        }
    }

    public void sellCar(Voertuig voertuig) {
        boolean carIsInStock = false;
        for (int i = 0; i < tekoopVoertuig.length; i++) {
            if (tekoopVoertuig[i] == voertuig) {
                tekoopVoertuig[i] = null;
                carIsInStock = true;
                System.out.println("Car sold!");
                break;
            }
        }
        if (carIsInStock == false) {
            System.out.println("Car is not found in stock");
            printavailableCars();
        }
    }

    public void printavailableCars() {
        for (int i = 0; i < tekoopVoertuig.length; i++) {
            if (tekoopVoertuig[i] != null)
            System.out.println(tekoopVoertuig[i].getModel());
        }
    }
}
