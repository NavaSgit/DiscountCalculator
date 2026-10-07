package co.edu.unac;

public class InvalidPurchaseException extends RuntimeException {
    public InvalidPurchaseException(String message) {
        super(message);
    }
}
