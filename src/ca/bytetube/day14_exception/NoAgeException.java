package ca.bytetube.day14_exception;

public class NoAgeException extends Exception{
    public NoAgeException() {
        super();
    }

    public NoAgeException(String message) {
        super(message);
    }
}
