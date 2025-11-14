package wrapperClass;

public class shoppingCartPrice {
	static void convert(String[] prices) {
		int sum=0;
		for(String s:prices) {
			try {
				sum+=(Integer.parseInt(s));
			}catch(NumberFormatException e) {
				sum+=0;
				System.out.println("invalid price: "+s);
			}
		}
		System.out.println("The total price is "+sum);
	}
	public static void main(String[] args) {
		String[] prices={"250","499","99","abc"};
		convert(prices);
	}
}
