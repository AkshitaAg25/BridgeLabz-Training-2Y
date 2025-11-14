package exceptionhandling.productReview;

import java.util.Scanner;

public class Runner {
	
	//method
	static void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
		if(rating<1 || rating>5) {
			throw new InvalidRatingException("Rating must lie between 1 and 5");
		}if(comment.length()<=0) {
			throw new EmptyReviewException("Review can't be empty!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Rating(from 1 to 5):");
		int rating= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a review:");
		String comment = sc.nextLine();
		try {
			submitReview(rating, comment);
		}catch(EmptyReviewException e){
			System.out.println(e.getMessage());
		}catch(InvalidRatingException e) {
			System.out.println(e.getMessage());
		}
	}
}
