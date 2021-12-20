package animals;

public class Eagle extends Carnivorous implements Fly, Voice {
    private String voice;
    private int satiety;

    @Override
    public void fly() {
    }

    @Override
    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }
}
