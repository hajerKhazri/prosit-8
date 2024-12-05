package Entities;

import java.util.Objects;

public class Departement {


    public Departement(String rh) {
    }

    public <departement> departement getNom() {
        return null;
    }

    public class Departement {

        private int id;
        private String nom;
        private int nombreEmployes;


        public Departement() {
            this.id = 0;
            this.nom = "";
            this.nombreEmployes = 0;
        }


        public Departement(int id, String nom, int nombreEmployes) {
            this.id = id;
            this.nom = nom;
            this.nombreEmployes = nombreEmployes;
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

        public int getNombreEmployes() {
            return nombreEmployes;
        }

        public void setNombreEmployes(int nombreEmployes) {
            this.nombreEmployes = nombreEmployes;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Departement that = (Departement) obj;
            return id == that.id && Objects.equals(nom, that.nom);
        }

        // Redéfinition de toString
        @Override
        public String toString() {
            return "Département{id=" + id + ", nom='" + nom + "', nombreEmployes=" + nombreEmployes + '}';
        }

        // Redéfinition de hashCode (important pour l'utilisation dans HashSet)
        @Override
        public int hashCode() {
            return Objects.hash(id, nom);
        }
    }

}
