package exceptionhandling.OnlineOrder;

public class PaymentFailedException extends Exception{
	PaymentFailedException(String message){
		super(message);
	}
}
