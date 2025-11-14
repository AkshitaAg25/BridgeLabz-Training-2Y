package wrapperClass;

import java.util.Scanner;

public class LoginSystem {
	static void validateAge(String num) {
		try {
			if(Integer.parseInt(num)>=18) {
				System.out.println(true);
			}else if(Integer.parseInt(num)<18) {
				System.out.println(false);
			}
		}catch(NumberFormatException e){
			System.out.println("Enter age in numbers.");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		String age= sc.nextLine();
		validateAge(age);
		sc.close();
	}
}
