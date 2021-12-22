package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal{

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public boolean eat(Food food) throws WrongFoodException {
        if(food instanceof Grass) {
            return true;
        }
        else {
            throw new WrongFoodException();
        }
    }
}
