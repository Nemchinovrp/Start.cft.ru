package ru.cft.start.exceptions;

public class CannotReadFile extends RuntimeException {
    public CannotReadFile(String message) {
        super(message);
    }
}
