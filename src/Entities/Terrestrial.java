package Entities;

public class Terrestrial {
    public final class Terrestrial extends Animal {

        private int nbrLegs;

        public Terrestrial() {
        }

        public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
            super(family, name, age, isMammal);
            this.nbrLegs = nbrLegs;
        }

        @Override
        public String toString() {
            return super.toString() + ", nbrLegs:" + nbrLegs;
        }
    }
}

public class Terrestrial implements Omnivore<Food> {

    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println("L'animal terrestre mange de la viande.");
        } else {
            System.out.println("L'animal terrestre ne mange pas de ce type de nourriture.");
        }
    }

    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT) {
            System.out.println("L'animal terrestre mange des plantes.");
        } else {
            System.out.println("L'animal terrestre ne mange pas ce type de nourriture.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("L'animal terrestre mange à la fois de la viande et des plantes.");
        } else if (food == Food.MEAT) {
            System.out.println("L'animal terrestre mange de la viande.");
        } else if (food == Food.PLANT) {
            System.out.println("L'animal terrestre mange des plantes.");
        }
    }
}
