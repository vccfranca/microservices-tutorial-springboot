package br.com.trevezani.tutorial.internal.communication.exception;

public class InternalErrorException extends Exception {
	private static final long serialVersionUID = -3600093459389085078L;

	public InternalErrorException() {
		super();
	}
	
	public InternalErrorException(String message) {
		super(message);
	}
}
