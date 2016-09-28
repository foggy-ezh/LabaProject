package com.training.labs.first.exception;

/**
 * Created by USER on 24.09.2016.
 */
public class CircleWrongRadiusException extends Exception {
    public CircleWrongRadiusException() {
    }

    public CircleWrongRadiusException(String message) {
        super(message);
    }

    public CircleWrongRadiusException(String message, Throwable cause) {
        super(message, cause);
    }

    public CircleWrongRadiusException(Throwable cause) {
        super(cause);
    }
}
