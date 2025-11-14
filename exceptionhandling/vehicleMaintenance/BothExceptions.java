package exceptionhandling.vehicleMaintenance;

public class BothExceptions {
	
	public static class ServiceOverdueException extends Exception{
		ServiceOverdueException(String message){
			super(message);
		}
	}
	
	public static class InvalidMileageException extends Exception{
		InvalidMileageException(String message){
			super(message);
		}
	}
}
