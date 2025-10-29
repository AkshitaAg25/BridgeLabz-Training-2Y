package interfaces;

interface Vehicles{
	void rent();
	void returnVehicle();
}

public class MultiVehicle {
	public class Cars implements Vehicles{
		@Override
		public void rent() {
			System.out.println("Car for rent");
		}
		@Override
		public void returnVehicle() {
			System.out.println("Please return the Car");
		}
	}
	public class Bikes implements Vehicles{
		@Override
		public void rent() {
			System.out.println("Bike for rent");
			
		}
		@Override
		public void returnVehicle() {
			System.out.println("Please return the bike");
		}
	}
	public class Busses implements Vehicles{
		@Override
		public void rent() {
			System.out.println("Buses for rent");
			
		}
		@Override
		public void returnVehicle() {
			System.out.println("Please return the bus");
		}
	}
}
