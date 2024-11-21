package Entities;

public interface IDepartement<T>
{

        void addDepartement(T departement);
        boolean removeDepartement(T departement);
        boolean containsDepartement(T departement);
        void printAllDepartements();
}

