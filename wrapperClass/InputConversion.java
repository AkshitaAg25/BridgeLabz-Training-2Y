package wrapperClass;

import java.util.Scanner;

public class InputConversion {
	public static int safeParseInt(String input) {
		try {
			return Integer.parseInt(input);
		}catch(NumberFormatException e) {
			return -1;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		String n = sc.nextLine();
		System.out.println(safeParseInt(n));
		sc.close();
	}
}
