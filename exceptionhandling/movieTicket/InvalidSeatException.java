package exceptionhandling.movieTicket;

public class InvalidSeatException extends Exception{
	InvalidSeatException(String message){
		super(message);
	}

}
