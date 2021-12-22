package animals;

import model.Size;

public class Mouse extends Herbivore implements Run, Voice {
    private String voice;
    private int satiety;
    private String name;

    public Mouse(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Бегаю от кота");
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
