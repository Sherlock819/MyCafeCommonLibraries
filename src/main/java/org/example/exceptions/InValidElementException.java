package org.example.exceptions;

public class InValidElementException extends RuntimeException {
    private String message;

    public InValidElementException() {
    }

    public InValidElementException(String msg) {
        super(msg);
        this.message = msg;
    }
}
