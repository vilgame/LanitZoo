package animals;

import food.Food;

public abstract class Animal {
    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    public abstract boolean eat(Food food);

}
