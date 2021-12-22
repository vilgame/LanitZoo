package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal{


    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public boolean eat(Food food) throws WrongFoodException {
        if(food instanceof Meat) {
            return true;
        }
        else {
            throw new WrongFoodException();
        }
    }
}
