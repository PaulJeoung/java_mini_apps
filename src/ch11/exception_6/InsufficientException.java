package ch11.exception_6;

public class InsufficientException extends Exception{

	public InsufficientException() {
		
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
