package food;

public class WrongFoodException extends Exception {
    public WrongFoodException() {
        System.out.println("Класс еды не соответствует животному");
    }
}
