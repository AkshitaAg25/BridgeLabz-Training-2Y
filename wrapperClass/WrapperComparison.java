package wrapperClass;

public class WrapperComparison {
	public static void main(String[] args) {
		Integer a = 100;
		Integer b = 100;
		Integer c = 200;
		Integer d = 200;
		
		System.out.println("a==b :"+(a==b));
		System.out.println("a.equals(b): "+a.equals(b));
		
		System.out.println("c==d: "+(c==d));
		System.out.println("c.equals(d): "+c.equals(d));
		//int range is -128 to 127 so for value greater than 127 it checks the memory and not the value
	}
}
