package exceptionhandling.CustomException;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}