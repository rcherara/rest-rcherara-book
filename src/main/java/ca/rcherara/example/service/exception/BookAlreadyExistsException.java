package ca.rcherara.example.service.exception;

@SuppressWarnings("serial")
public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(final String message) {
        super(message);
    }
}
