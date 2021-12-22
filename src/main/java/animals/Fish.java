package animals;

import model.Size;

public class Fish extends Carnivorous implements Swim {
    private int satiety;
    private String name;

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю под водой");
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }

    public int getSatiety() {
        return satiety;
    }
}
