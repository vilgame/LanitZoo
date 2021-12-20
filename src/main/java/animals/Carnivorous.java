package animals;

import food.Food;
import food.Grass;

public class Carnivorous extends Animal{

    @Override
    public void eat(Food food) {
        if(food instanceof Grass) {
            System.out.println("Хищник не ест траву");
        }
    }
}
