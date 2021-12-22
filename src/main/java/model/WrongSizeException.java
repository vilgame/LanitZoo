package model;

public class WrongSizeException extends RuntimeException {

    public WrongSizeException() {
        System.out.println("Размер животного отличается от размера вольера");
    }
}
