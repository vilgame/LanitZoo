import animals.*;
import model.Aviary;
import model.Size;

public class Zoo {
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.LARGE);

    private static void fillCarnivorousAviary() {
        carnivorousAviary.addAnimal(new Kotik("Котик"));
        carnivorousAviary.addAnimal(new Fish("Щука"));
        carnivorousAviary.addAnimal(new Owl("Сова"));
    }

    private static void fillHerbivoreAviary() {
        herbivoreAviary.addAnimal(new Deer("Олень"));
        herbivoreAviary.addAnimal(new Mouse("Мышь"));
        herbivoreAviary.addAnimal(new Duck("Утка"));
    }

    private static Carnivorous getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);
    }

    private static Herbivore getHerbivore(String name) {
        return herbivoreAviary.getAnimal(name);
    }
}

