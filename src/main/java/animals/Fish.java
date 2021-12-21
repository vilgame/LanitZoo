package animals;

import food.Food;

public class Fish extends Carnivorous implements Swim {
    private int satiety;

    @Override
    public void swim() {
        System.out.println("Плаваю под водой");
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    @Override
    public boolean eat(Food food) {
        if (super.eat(food)) {
            this.satiety += food.getEnergy();
        }
        return true;
    }

}
