package exceptionhandling.vehicleMaintenance;

import exceptionhandling.vehicleMaintenance.BothExceptions.InvalidMileageException;
import exceptionhandling.vehicleMaintenance.BothExceptions.ServiceOverdueException;

public class Runner {
	static void checkMaintenance(int c) throws InvalidMileageException, ServiceOverdueException{
		if(c<0) {
			throw new BothExceptions.InvalidMileageException("mileage reading can't be negative");
		}else {
			throw new BothExceptions.ServiceOverdueException("The service is overdue");
		}
	}
	public static void main(String[] args) {
		try {
			checkMaintenance(5);
		}catch(ServiceOverdueException e) {
			System.out.println(e.getMessage());
		}catch(InvalidMileageException e) {
			System.out.println(e.getMessage());
		}
	}
}
