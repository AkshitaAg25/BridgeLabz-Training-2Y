package exceptionhandling.BankingTransaction;

public class NetworkFailureException extends Exception{
	NetworkFailureException(String message){
		super(message);
	}
}
