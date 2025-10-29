package interfaces;

interface Payment{
	void pay();
}

public class DigitalPayment {
	public class UPI implements Payment{
		public void pay() {
			System.out.println("Payment using UPI");
		}
	}
	public class CreditCard implements Payment{
		public void pay() {
			System.out.println("Payment using Credit Card");
		}
	}
}
