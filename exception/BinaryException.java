package Hata;

public class BinaryException extends Exception {
    public BinaryException(String message) {
        super(message);
        System.out.println("HATA");
    }
}
