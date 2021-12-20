package animals;

public class Mouse extends Herbivore implements Run, Voice {
    private String voice;

    @Override
    public void run() {

    }

    @Override
    public String getVoice() {
        return voice;
    }
}
