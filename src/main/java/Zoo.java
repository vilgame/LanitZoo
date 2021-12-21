import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {

    public static void main(String[] args) {
        Deer deer = new Deer();
        Duck duck = new Duck();
        Eagle eagle = new Eagle();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();
        Mouse mouse = new Mouse();
        Food grass = new Grass();
        Food meat = new Meat();
        Worker worker = new Worker();
        worker.feed(deer, meat);
        System.out.println("Олень: Сытость = " + deer.getSatiety());
        worker.feed(deer, grass);
        System.out.println("Олень: Сытость = " + deer.getSatiety());
        worker.feed(kotik, meat);
        System.out.println("Котик: Сытость = " + kotik.getSatiety());
        worker.feed(kotik, grass);
        System.out.println("Котик: Сытость = " + kotik.getSatiety());
        System.out.println(worker.getVoice(duck));
        System.out.println(worker.getVoice(kotik));
        Swim[] swimmers = createPond();
        for (Swim s : swimmers) {
            s.swim();
        }
    }

    public static Swim[] createPond() {
        Swim[] swimmers = new Swim[2];
        swimmers[0] = new Duck();
        swimmers[1] = new Fish();
        return swimmers;
    }
}