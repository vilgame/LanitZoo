package animals;

public class Fish extends Carnivorous implements Swim {
    private int satiety;

    @Override
    public void swim() {
    }

    public int getSatiety() {
        return satiety;
    }
}
