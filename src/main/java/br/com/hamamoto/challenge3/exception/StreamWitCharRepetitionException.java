package br.com.hamamoto.challenge3.exception;

/**
 * This exception is throw when the input has repeated chars
 */
public class StreamWitCharRepetitionException extends RuntimeException {
    public StreamWitCharRepetitionException() {
        super("Texto possui apenas caracteres repetidos");
    }
}
