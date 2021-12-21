package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    @Override
    public boolean eat(Food food) {
        if(food instanceof Grass) {
            return true;
        }
        else {
            System.out.println("Травоядное не ест мясо");
            return false;
        }
    }
}
