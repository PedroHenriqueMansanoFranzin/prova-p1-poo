package br.com.starlog.exception;
public class CapacidadeExcedidaException extends Exception {
    public CapacidadeExcedidaException(String message) {
        super("Modulo '<codigoModulo>' atingiu a capacidade maxima de '<capacidadeMaxima> cargas.");
    }
}
