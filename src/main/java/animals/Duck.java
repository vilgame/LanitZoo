package animals;

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
}
