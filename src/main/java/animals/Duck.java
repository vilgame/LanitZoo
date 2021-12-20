package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    private String voice;

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
}
