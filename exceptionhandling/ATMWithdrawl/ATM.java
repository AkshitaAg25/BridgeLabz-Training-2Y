package exceptionhandling;

import java.util.Scanner;
class InsufficientfundsException extends Exception{
	InsufficientfundsException(String s){
		super(s);
	}
}
public class ATM{

	public static void main(String[] agrs) throws InsufficientfundsException{
		int balance = 10000;
		
		//input of amount to withdraw
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		int withdrawamount = inp.nextInt();
		
		try {
			if(withdrawamount > balance) {
				throw new InsufficientfundsException("can not withdraw, your account balance is "+balance);
			}else {
				System.out.println("enough balance you can withraw");
			}
		}catch(InsufficientfundsException e){
			System.out.println(e.getMessage());
		}
		inp.close();
	}
}
