package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public class Owl extends Carnivorous implements Fly, Voice {
    private String voice;
    private int satiety;
    private String name;

    public Owl(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Летаю ночью");
    }

    @Override
    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public boolean eat(Food food) {
        try {
            if (super.eat(food)) {
                this.satiety += food.getEnergy();
            }
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return true;
    }
}
