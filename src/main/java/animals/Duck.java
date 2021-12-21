package animals;

import food.Food;

public class Duck extends Herbivore implements Swim, Fly, Voice, Run {
    private String voice;
    private int satiety;

    @Override
    public void fly() {
        System.out.println("Летаю на юг");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю по воде");
    }

    @Override
    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public boolean eat(Food food) {
        if (super.eat(food)) {
            this.satiety += food.getEnergy();
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println("Смешно бегаю");
    }
}