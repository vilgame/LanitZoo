package animals;

import model.Size;

public class Duck extends Herbivore implements Swim, Fly, Voice, Run {
    private String voice;
    private int satiety;

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Летаю на юг");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю по воде");
    }

    @Override
    public void run() {
        System.out.println("Смешно бегаю");
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