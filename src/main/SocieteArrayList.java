package main;

import Entities.Employe;
import Entities.GestionEmploye;

public class SocieteArrayList {
    public static class Main {
        public static void main(String[] args) {

            GestionEmploye gestion = new GestionEmploye();


            gestion.ajouterEmploye(new Employe(1, "Ben Ali", "Ahmed", "Informatique", 3));
            gestion.ajouterEmploye(new Employe(2, "Salah", "Nizar", "Marketing", 2));
            gestion.ajouterEmploye(new Employe(3, "Ben Ali", "Mohamed", "Informatique", 1));


            System.out.println("Avant tri :");
            gestion.displayEmploye();


            gestion.trierEmployeParId();
            System.out.println("\nAprès tri par ID :");
            gestion.displayEmploye();


            gestion.trierEmployeParNomDepartementEtGrade();
            System.out.println("\nAprès tri par nom, département et grade :");
            gestion.displayEmploye();


            boolean existe = gestion.rechercherEmploye("Ben Ali");
            System.out.println("\nExistence d'un employé avec le nom 'Ben Ali' : " + existe);


            gestion.supprimerEmploye(new Employe(1, "Ben Ali", "Ahmed", "Informatique", 3));
            System.out.println("\nAprès suppression :");
            gestion.displayEmploye();
        }
    }


}
