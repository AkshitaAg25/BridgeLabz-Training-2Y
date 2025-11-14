package exceptionhandling.productReview;

public class EmptyReviewException extends Exception{
	EmptyReviewException(String message){
		super(message);
	}
}
