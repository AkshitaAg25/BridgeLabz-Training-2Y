package exceptionhandling;

import java.util.Scanner;

public class ATMusingthrows {
	
	static void check(int a,int b) throws InsufficientfundsException{
	if(a > b) {
		throw new InsufficientfundsException("your account balance is "+b);
		}
	}
	
	public static void main(String[] agrs) {
		int balance = 10000;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		int withdrawamount = inp.nextInt();
		
		inp.close();
		
		try {
		check(withdrawamount,balance);
		}catch(InsufficientfundsException  e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
