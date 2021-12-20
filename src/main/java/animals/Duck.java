package animals;

import food.Food;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    private String voice;
    private int satiety;

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }

    @Override
    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public boolean eat(Food food) {
        if (super.eat(food)) {
            this.satiety += food.getEnergy();
            System.out.println("Inside = " + getSatiety());
            return true;
        }
        else {
            return false;
        }
    }
}
