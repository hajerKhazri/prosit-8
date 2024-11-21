package Entities;


    public class Employe {
        private int id;
        private String nom;
        private String prenom;
        private String nomDepartement;
        private int grade;

        // Constructeur avec paramètres
        public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.nomDepartement = nomDepartement;
            this.grade = grade;
        }

        // Constructeur sans paramètre
        public Employe() {
            // Initialisation avec des valeurs par défaut
            this.id = 0;
            this.nom = "";
            this.prenom = "";
            this.nomDepartement = "";
            this.grade = 0;
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
            Employe employe = (Employe) obj;
            return id == employe.id && nom.equals(employe.nom);
        }

        // Redéfinition de la méthode toString
        @Override
        public String toString() {
            return "Employe{id=" + id + ", nom='" + nom + "', prenom='" + prenom + "', departement='" + nomDepartement + "', grade=" + grade + "}";
        }
    }

