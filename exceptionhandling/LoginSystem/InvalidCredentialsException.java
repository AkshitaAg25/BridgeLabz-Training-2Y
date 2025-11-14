package exceptionhandling.LoginSystem;

public class InvalidCredentialsException extends Exception{
	public InvalidCredentialsException(String message){
		super(message);
	}
}
