package exceptionhandling.BankingTransaction;

import java.util.Random;

public class Transaction {
	public static void transactioncheck() throws NegativeAmountException,InsufficientFundsException,NetworkFailureException {
		Random r = new Random();
		int choice = r.nextInt(4);
		switch(choice) {
		case 1:
			throw new NegativeAmountException("The amount entered is negative");
		case 2:
			throw new InsufficientFundsException("Insufficient Funds");
		case 3:
			throw new NetworkFailureException("Network Faliure");
		default:
			System.out.println("The transaction is successfull");
		}
	}
	
}
