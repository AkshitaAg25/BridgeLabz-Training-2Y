package exceptionhandling.ExamSubmission;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file Name: ");
		String fileName=sc.nextLine();
		System.out.println("Enter time you are submitting(in 24hr format):");
		int localTime=sc.nextInt();
		int submissionTime=16;
		try {
			Submission.submitExam(fileName,localTime,submissionTime);
		}catch(LateSubmissionException e) {
			System.out.println(e.getMessage());
		}catch(InvalidFileFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
