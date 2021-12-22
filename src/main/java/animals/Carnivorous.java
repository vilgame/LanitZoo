package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{


    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public boolean eat(Food food) {
        if(food instanceof Meat) {
            return true;
        }
        else {
            System.out.println("Хищник не ест траву");
            return false;
        }
    }
}
