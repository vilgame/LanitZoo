package animals;

import food.Food;

public class Kotik extends Carnivorous implements Run, Voice {
    private String voice;
    private int satiety;

    @Override
    public void run() {
        System.out.println("Тыгыдык");
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
