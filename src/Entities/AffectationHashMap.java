import Entities.Departement;
import Entities.Employe;
import jdk.internal.classfile.impl.ClassPrinterImpl;

import java.util.HashMap;
import java.util.Map;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

public class affectationHashMap {
    private final Map<String, String> affectations;


    public affectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public boolean affecterEmploye(String employeId, String departement) {
        if (affectations.containsKey(employeId)) {
            System.out.println("L'employé " + employeId + " est déjà affecté à un département.");
            return false;
        }
        affectations.put(employeId, departement);
        return true;
    }


    public boolean retirerEmploye(String employeId) {
        if (affectations.containsKey(employeId)) {
            affectations.remove(employeId);
            return true;
        }
        System.out.println("L'employé " + employeId + " n'a pas d'affectation enregistrée.");
        return false;
    }

    public String getDepartement(String employeId) {
        return affectations.get(employeId);
    }


    public void afficherAffectations() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation enregistrée.");
            return;
        }
        System.out.println("Affectations des employés :");
        for (Map.Entry<String, String> entry : affectations.entrySet()) {
            System.out.println("Employé ID : " + entry.getKey() + " -> Département : " + entry.getValue());
        }
    }
}
class employe {
    private final String id;
    private final String nom;

    public employe(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Employe{id='" + id + "', nom='" + nom + "'}";
    }
}

class departement {
    private final String nom;

    public departement(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Departement{nom='" + nom + "'}";
    }
}
public <processEnvironment> boolean ajouterEmployeDepartement(Employe e, Departement d) throws InterruptedException {
    processEnvironment affectations = null;
    if (Boolean.parseBoolean(affectations.toString())) {
        System.out.println("L'employé " + e.getNom() + " est déjà affecté à un département.");
        return false;
    }
    affectations.wait(e.getId(), d.getNom());
    System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNom() + ".");
    return true;
}

/**
 * Méthode pour afficher tous les employés et leurs départements.
 */
public void afficherEmployesEtDepartements() {
    ClassPrinterImpl.MapNodeImpl affectations;*;
    if (affectations.isEmpty()) {
        System.out.println("Aucune affectation enregistrée.");
        return;
    }

    System.out.println("Liste des employés et leurs départements :");
    for (Map.Entry<String, String> entry : affectations.entrySet()) {
        System.out.println("Employé ID : " + entry.getKey() + " -> Département : " + entry.getValue());
    }
}

public void main() {
}
public boolean supprimerEmploye(Employe e) {
    ProcessEnvironment affectations = null;
    if (affectations.containsKey(e.getId())) {
        affectations.remove(e.getId());
        System.out.println(
                affectations.remove(e.getId());
        System.o

        affectations.remove(e.getId());
        affectations.remove(e.getId());

        affectations.remove(e.getId());

        affectations.remove(e.get "Employé " + e.getNom() + " supprimé.");

        return true;
    } else {
        System.out.println(
                System.out.pr

                System.out


                "L'employé " + e.getNom() + " n'existe pas dans la collection.");
        return false;
    }
}

