package animals;

public class Eagle extends Carnivorous implements Fly, Voice {
    private String voice;

    @Override
    public void fly() {

    }

    @Override
    public String getVoice() {
        return voice;
    }
}
