package exceptionhandling.OnlineOrder;

public class OnlineOrderSystem {
	static void placeOrder(int choice) throws PaymentFailedException, OutOfStockException{
		switch(choice) {
		case 1:
			throw new OutOfStockException("Out of stock");
		case 2:
			throw new PaymentFailedException("Payment failed");
		case 3:
			System.out.println("Order Sucessfully placed");
		default:
			System.out.println("invaild choice, enter 1,2 or 3");
		}
	}
	
}
