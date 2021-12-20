package animals;

public class Mouse extends Herbivore implements Run, Voice {
    private String voice;
    private int satiety;

    @Override
    public void run() {
    }

    @Override
    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }
}
