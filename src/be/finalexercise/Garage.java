package be.finalexercise;

import java.util.ArrayList;

public class Garage {

    private String employee;
    private String garageName;

    private static Voertuig[] tekoopVoertuig = new Voertuig[50];
    private Voertuig[] tereparerenVoertuig;

    public Garage() {
    }

    public Garage(String employee, String garageName) {
        this.employee = employee;
        this.garageName = garageName;
    }

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

    public void changeOil(Voertuig v) {
        System.out.println("Olie is veranderd!");
    }

    public void addCar(Voertuig v) {
        boolean carisAdded = false;
        for (int i = 0; i < tekoopVoertuig.length; i++) {
            if (tekoopVoertuig[i] == v) {
                tekoopVoertuig[i] = null;
                carisAdded = true;
                System.out.println("Car is sold!");
                break;
            }
            if (carisAdded = false) {
                System.out.println("No place available in stock :(");
            }
        }
    }

    public void sellCar(Voertuig v) {
        boolean carisInStock = false;
        for (int i = 0; i < tekoopVoertuig.length; i++) {
            if (tekoopVoertuig[i] == v) {
                tekoopVoertuig[i] = null;
                carisInStock = true;
            }
        }
        if (carisInStock = false) {
            try {
                throw new Exception("Car is not available in our stock!");
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void printavailableCars() {
        for (int i = 0; i < tekoopVoertuig.length ; i++) {
            if (tekoopVoertuig[i] == null) {
                System.out.println(tekoopVoertuig[i].getMerk());
            }
        }
    }
}
