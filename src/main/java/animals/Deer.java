package animals;

public class Deer extends Herbivore implements Run {
    private int satiety;

    @Override
    public void run() {
    }

    public int getSatiety() {
        return satiety;
    }
}
