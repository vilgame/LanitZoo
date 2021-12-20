package animals;

import food.Food;
import food.Meat;

public class Herbivore extends Animal{

    @Override
    public void eat(Food food) {
        if(food instanceof Meat) {
            System.out.println("Травоядное не ест мясо");
        }
    }
}
