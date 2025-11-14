package exceptionhandling.BankingTransaction;

public class Runner {
	public static void main(String[] args) {
		try {
			Transaction.transactioncheck();
		}catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}catch(NetworkFailureException e) {
			System.out.println(e.getMessage());
		}
	}
}
