package exceptionhandling.LoginSystem;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {
			System.out.println("Enter user name ");
			String user=sc.nextLine();
			System.out.println("Enter password");
			String pass=sc.nextLine();
			LoginSystem.validate(user, pass);
		}catch(InvalidCredentialsException e){
			System.out.println(e.getMessage());
		}
	}
}
