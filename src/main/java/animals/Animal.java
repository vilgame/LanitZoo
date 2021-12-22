package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

import java.util.Objects;


public abstract class Animal {
    protected int satiety;
    protected String name;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Size getSize();

    public int getSatiety() {
        return satiety;
    }

    public abstract boolean eat(Food food) throws WrongFoodException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
