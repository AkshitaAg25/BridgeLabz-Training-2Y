package interfaces;

interface Devices{
	void turnOn();
	void turnOff();
}

public class SmartDevice {
	class  lights implements Devices{
		@Override
		public void turnOn() {
			System.out.println("The lights are on");
		}

		@Override
		public void turnOff() {
			System.out.println("The lights are off");
			
		}
	}
	
	class  AC implements Devices{
		@Override
		public void turnOn() {
			System.out.println("The AC are on");
		}

		@Override
		public void turnOff() {
			System.out.println("The AC are off");
			
		}
	}
	
	class  TV implements Devices{
		@Override
		public void turnOn() {
			System.out.println("The TV are on");
		}

		@Override
		public void turnOff() {
			System.out.println("The TV are off");
			
		}
	}
}
