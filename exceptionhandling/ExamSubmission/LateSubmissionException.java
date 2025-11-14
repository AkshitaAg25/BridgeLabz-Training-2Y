package exceptionhandling.ExamSubmission;

public class LateSubmissionException extends Exception{
	LateSubmissionException(String message){
		super(message);
	}
}
