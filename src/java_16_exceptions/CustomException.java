package java_16_exceptions;

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new BookNotFoundException("Book not found");
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

/*
 * For checked exception extend Exception.
 * For unchecked exception extend RuntimeException.
 */