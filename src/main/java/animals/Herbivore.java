package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal{

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if(food instanceof Grass) {
            Grass grass = new Grass();
            satiety += grass.getEnergy();
        }
        else {
            throw new WrongFoodException();
        }
    }
}
