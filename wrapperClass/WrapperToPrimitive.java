package wrapperClass;

public class WrapperToPrimitive {
	public static void main(String[] args) {
		Double num = 45.67;
		double primitivenum=num;
		int intnum=(int) primitivenum;
		System.out.println("Value: "+num);
		System.out.println("double: "+primitivenum);
		System.out.println("int: "+intnum);
	}
}
