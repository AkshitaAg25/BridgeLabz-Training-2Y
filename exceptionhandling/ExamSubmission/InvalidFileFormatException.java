package exceptionhandling.ExamSubmission;

public class InvalidFileFormatException extends Exception{
	InvalidFileFormatException(String message){
		super(message);
	}
}
