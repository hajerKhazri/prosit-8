import Entities.Departement;

import java.util.HashMap;
import java.util.Map;

public static class employe {
        public String get;
        private int id;
        private String nom;
        private String prenom;
        private String nomDepartement;
        private int grade;

        // Constructeur avec paramètres
        public employe(int id, String nom, String prenom, String nomDepartement, int grade) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.nomDepartement = nomDepartement;
            this.grade = grade;
        }

        // Constructeur sans paramètre
        public employe() {
            // Initialisation avec des valeurs par défaut
            this.id = 0;
            this.nom = "";
            this.prenom = "";
            this.nomDepartement = "";
            this.grade = 0;
        }

        public employe(String e001, String alice) {
        }

        // Getters et Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getNomDepartement() {
            return nomDepartement;
        }

        public void setNomDepartement(String nomDepartement) {
            this.nomDepartement = nomDepartement;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        // Redéfinition de la méthode equals
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            employe employe = (Entities.employe) obj;
            return id == employe.id && nom.equals(employe.nom);
        }

        // Redéfinition de la méthode toString
        @Override
        public String toString() {
            return "Employe{id=" + id + ", nom='" + nom + "', prenom='" + prenom + "', departement='" + nomDepartement + "', grade=" + grade + "}";
        }
    }
    public boolean supprimerEmployeEtDepartement(employe e, Departement d) {
        ProcessEnvironment affectations = null;
        if (affectations.containsKey
                (e.getId())) {
            String departementActuel = affectations.get(e.getId());
            if (departementActuel.equals(d.getNom())) {
                affectations.remove(e.getId());
                System.out.println("Employé " + e.getNom() + " supprimé du département " + d.getNom() + ".");
                return true;
            } else {
                System.out.println("L'employé " + e.getNom() + " n'est pas affecté au département " + d.getNom() + ".");
                return false;
            }
        } else {
            System.out.println("L'employé " + e.getNom() + " n'existe pas dans la collection.");
            return false;
        }
    }
    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation enregistrée.");
            return;
        }

        System.out.println("Liste des employés et leurs départements :");
        for (Map.Entry<String, String> entry : affectations.entrySet()) {
            System.out.println("Employé ID : " + entry.getKey() + " -> Département : " + entry.getValue());
        }
    }
    public boolean rechercherEmploye(employe e) {
        HashMap<Object, Object> affectations;
        if (affectations.containsKey(e.getId())) {
            System.out.println("L'employé " + e.getNom() + " existe dans la collection.");

            return true;
        } else {
            System.out.println("L'employé " + e.getNom() + " n'existe pas dans la collection.");
            return false;
        }
    }

public void main() {
}
public boolean rechercherDepartement(Departement d) {
    HashMap<Object, Object> affectations;
    if (affectations.containsValue(d.getNom())) {
        System.out.println("Le département " + d.getNom() + " existe dans la collection.");
        return true;
    } else {
        System.out.println("Le département " + d.getNom() + " n'existe pas dans la collection.");
        return false;
    }
}














