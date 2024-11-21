package Entities;

import java.util.HashSet;
import java.util.Set;

public class DepartementHashSet<T> implements IDepartement<T> {
            private final Set<Departement> departements;


            public DepartementHashSet() {
                this.departements = new HashSet<>();
            }


            public void addDepartement(Departement departement) {
                departements.add(departement);
            }


            public boolean removeDepartement(Departement departement) {
                return departements.remove(departement);
            }


            public boolean containsDepartement(Departement departement) {
                return departements.contains(departement);
            }


            public void printAllDepartements() {
                for (Departement departement : departements) {
                    System.out.println(departement);
                }
            }


        }

