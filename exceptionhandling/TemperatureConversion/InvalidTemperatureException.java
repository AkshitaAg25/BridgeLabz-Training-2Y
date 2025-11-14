package exceptionhandling.TemperatureConversion;

public class InvalidTemperatureException extends Exception{
	InvalidTemperatureException(String message){
		super(message);
	}
}
