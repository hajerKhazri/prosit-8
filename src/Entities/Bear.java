package Entities;


public class Bear implements Omnivore<Food>{

    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println("Le bear mange de la viande.");
        }
    }


    public void eatPlant(Food food) {
        if (food == Food.PLANT) {
            System.out.println("Le bear mange des plantes.");
        }
    }


    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Le bear mange à la fois de la viande et des plantes.");
        }
    }
}

