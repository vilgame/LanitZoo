package animals;

import model.Size;

public class Kotik extends Carnivorous implements Run, Voice {
    private String voice;
    private int satiety;

    public Kotik(String name) {
        super(name);
    }

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

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    public int getSatiety() {
        return satiety;
    }
}
