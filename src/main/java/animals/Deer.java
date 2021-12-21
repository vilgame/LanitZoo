package animals;

import food.Food;

public class Deer extends Herbivore implements Run {
    private int satiety;

    @Override
    public void run() {
        System.out.println("Бегаю по лесу");
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public boolean eat(Food food) {
        if (super.eat(food)) {
            this.satiety += food.getEnergy();
        }
        return true;
    }
}
