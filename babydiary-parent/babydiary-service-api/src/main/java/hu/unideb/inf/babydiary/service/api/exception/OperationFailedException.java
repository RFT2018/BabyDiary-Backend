package hu.unideb.inf.babydiary.service.api.exception;

public class OperationFailedException extends Exception {

    public OperationFailedException(String message) {
        super(message);
    }

    public OperationFailedException(Throwable cause) {
        super(cause);
    }
}
