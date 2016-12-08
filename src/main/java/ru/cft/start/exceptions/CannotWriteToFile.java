package ru.cft.start.exceptions;

public class CannotWriteToFile extends RuntimeException {
    public CannotWriteToFile(String message) {
        super(message);
    }
}
