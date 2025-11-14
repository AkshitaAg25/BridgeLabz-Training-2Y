package exceptionhandling.movieTicket;

public class SeatAlreadyBookedException extends Exception{
	SeatAlreadyBookedException(String message){
		super(message);
	}
}
