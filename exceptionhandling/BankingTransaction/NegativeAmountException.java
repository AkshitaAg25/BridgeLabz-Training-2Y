package exceptionhandling.BankingTransaction;

public class NegativeAmountException extends Exception {
	NegativeAmountException(String message){
		super(message);
	}
}
