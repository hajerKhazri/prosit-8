package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestionEmploye implements IGestion<employe> {
    private List<employe> employes;

    // Constructeur
    public GestionEmploye() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Entities.employe employe : employes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Entities.employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(employe::getId));
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                int result = e1.getNom().compareTo(e2.getNom());
                if (result == 0) {
                    result = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                }
                if (result == 0) {
                    result = Integer.compare(e1.getGrade(), e2.getGrade());
                }
                return result;
            }
        });
    }
}

