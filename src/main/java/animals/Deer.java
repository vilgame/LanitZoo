package animals;

import food.Food;
import model.Size;

public class Deer extends Herbivore implements Run {
    private int satiety;
    private String name;

    public Deer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Бегаю по лесу");
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
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
