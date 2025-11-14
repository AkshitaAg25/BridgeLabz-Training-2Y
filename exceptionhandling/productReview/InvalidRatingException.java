package exceptionhandling.productReview;

public class InvalidRatingException extends Exception{
	InvalidRatingException(String message){
		super(message);
	}
}
