package be.vincent;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    //InstanceVariabelen (een unieke variabele voor het object dat je maakt)
    private String employee;
    private String garageName;

    //Statischevariabele (membervariabele) is een variabele die behoort tot de klasse (het is een variabele die geschakeld is aan de klasse)

    private static Voertuig[] tekoopVoertuig = new Voertuig[50];
    List<Voertuig> tereparerenVoertuig = new ArrayList<>();

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

    public List<Voertuig> getTereparerenVoertuig() {
        return tereparerenVoertuig;
    }

    public void setTereparerenVoertuig(List<Voertuig> tereparerenVoertuig) {
        this.tereparerenVoertuig = tereparerenVoertuig;
    }

    public void changeOil(Voertuig voertuig) {
        for (int i = 0; i < tereparerenVoertuig.size() ; i++) {
            if (tereparerenVoertuig.get(i) == voertuig) {
                System.out.println("Changing Oil: " + employee + ": " + getTereparerenVoertuig().get(i).getMerk());
                tereparerenVoertuig.remove(i);
                return;
            }
        }
        System.out.println("Car is not found!");
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
            printavailableCars();

            try {
                throw new Exception("Car is not available to sell!");
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void printavailableCars() {
        for (int i = 0; i < tekoopVoertuig.length; i++) {
            if (tekoopVoertuig[i] != null)
                System.out.println(tekoopVoertuig[i].getMerk());
        }
    }

    public void changeAirco(Voertuig voertuig) {
        for (int i = 0; i < tereparerenVoertuig.size(); i++) {
            if (tereparerenVoertuig.get(i) == voertuig) {
                System.out.println("Changing airco: " + employee + ": " + getTereparerenVoertuig().get(i).getMerk());
                tereparerenVoertuig.remove(i);
                return;
            }
        }
        System.out.println("Car is not found!");
    }
}
