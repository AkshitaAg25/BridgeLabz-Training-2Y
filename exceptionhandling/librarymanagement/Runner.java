package exceptionhandling.librarymanagement;

import java.util.Scanner;

public class Runner {
	
	public static void check(int c) throws UserLimitExceededException,InvalidReturnException,BookNotAvailableException{
		switch(c) {
		case 1:
			throw new BookNotAvailableException("book not available");
		case 2:
			throw new InvalidReturnException("Invaild return");
		case 3:
			throw new UserLimitExceededException("Borrowing more than 5 books is not allowed");
		default:
			System.out.println("No problem, go ahead");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one:");
		System.out.println("1. borrows a book that's checkedout");
		System.out.println("2. returning a book not borrowed.");
		System.out.println("3. borrows more than 5 books.");
		int c= sc.nextInt();
		try {
			check(c);
		}catch(BookNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidReturnException e) {
			System.out.println(e.getMessage());
		}catch(UserLimitExceededException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Thankyou");
		}
	}
}
