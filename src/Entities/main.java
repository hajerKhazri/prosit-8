package Entities;

public class main {
    public static void main(String[] args) {
        // Création de la collection AffectationHashMap
        AffectationHashMap gestionAffectations = new AffectationHashMap();

        // Création d'employés et de départements
        Employe e1 = new Employe("E001", "Alice");
        Employe e2 = new Employe("E002", "Bob");

        Departement d1 = new Departement("Informatique");
        Departement d2 = new Departement("Marketing");
        Departement d3 = new Departement("RH");

        // Ajout des pairs Employe-Département
        gestionAffectations.ajouterEmployeDepartement(e1, d1); // Alice -> Informatique
        gestionAffectations.ajouterEmployeDepartement(e2, d2); // Bob -> Marketing

        // Affichage initial
        System.out.println("\nAffichage initial :");
        gestionAffectations.afficherEmployesEtDepartements();


        gestionAffectations.afficherEmployesEtDepartemets
    }
}