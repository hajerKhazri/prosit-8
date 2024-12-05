package Entities;

import java.util.HashSet;
import java.util.Set;

public class DepartementHashSet<T> implements IDepartement<T> {
            private final Set<departement> departements;


            public DepartementHashSet() {
                this.departements = new HashSet<>();
            }


            public void addDepartement(departement departement) {
                departements.add(departement);
            }


            public boolean removeDepartement(departement departement) {
                return departements.remove(departement);
            }


            public boolean containsDepartement(departement departement) {
                return departements.contains(departement);
            }


    @Override
    public void addDepartement(T departement) {
        
    }

    @Override
    public boolean removeDepartement(T departement) {
        return false;
    }

    @Override
    public boolean containsDepartement(T departement) {
        return false;
    }

    public void printAllDepartements() {
                for (Entities.departement departement : departements) {
                    System.out.println(departement);
                }
            }


        }

