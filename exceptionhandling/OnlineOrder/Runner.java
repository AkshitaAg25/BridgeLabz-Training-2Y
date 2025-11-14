package exceptionhandling.OnlineOrder;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your options:");
		System.out.println("1. order out of stock");
		System.out.println("2. payment failed");
		System.out.println("3. order placed successfully");
		int choice = sc.nextInt();
		try {
			OnlineOrderSystem.placeOrder(choice);
		}catch(PaymentFailedException e) {
			System.out.println(e.getMessage());
		}catch(OutOfStockException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thank you");
		}
		
	}
}
