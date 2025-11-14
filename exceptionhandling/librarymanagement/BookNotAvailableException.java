package exceptionhandling.librarymanagement;

public class BookNotAvailableException extends Exception{
	BookNotAvailableException(String message){
		super(message);
	}
}
