import animals.Animal;
import animals.Duck;
import animals.Kotik;
import food.Food;
import food.Grass;
import food.Meat;

public class Application {

    public static void main(String[] args) {
//        Kotik Murs = new Kotik("Murs","Purr", 5, 5 );
//        Kotik Bars = new Kotik();
//        Bars.setName("Bars");
//        Bars.setVoice("Meow");
//        Bars.setSatiety(2);
//        Bars.setWeight(4);
//        String[] pastimeArray = Murs.liveAnotherDay();
//        for (String pastime : pastimeArray){
//            System.out.println(pastime);
//        }
//        System.out.println("Имя - " + Bars.getName() + ", Вес - " + Bars.getWeight());
//        System.out.println(compareVoice(Murs, Bars));
//        System.out.println("Количество котиков: " + Kotik.getCount());
//    }
//
//    private static boolean compareVoice(Kotik first, Kotik second) {
//        return first.getVoice().equals(second.getVoice());

        Duck White = new Duck();
        Food Food = new Grass();
        White.eat(Food);
        System.out.println(White.getSatiety());

    }
}