package br.com.trevezani.tutorial.internal.communication.exception;

public class BusinessException extends Exception {
	private static final long serialVersionUID = -2740755495080681937L;

	public BusinessException() {
		super();
	}
	
	public BusinessException(String message) {
		super(message);
	}
}
