package animals;

import food.Food;

public class Eagle extends Carnivorous implements Fly, Voice {
    private String voice;
    private int satiety;

    @Override
    public void fly() {
        System.out.println("Летаю высоко в небе");
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
}
