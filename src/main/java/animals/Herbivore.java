package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Herbivore extends Animal{

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
