package exceptionhandling.librarymanagement;

public class UserLimitExceededException extends Exception{
	UserLimitExceededException(String message){
		super(message);
	}
}
