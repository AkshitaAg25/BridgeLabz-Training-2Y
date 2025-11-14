package wrapperClass;

import java.util.Scanner;

public class CharacterWrapper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str= sc.nextLine();
		char[] strarray=str.toCharArray();
		int l=0,d=0,w=0,s=0;
		for(char c:strarray) {
			if(Character.isLetter(c)) {
				l++;
			}else if(Character.isDigit(c)) {
				d++;
			}else if(Character.isWhitespace(c)) {
				w++;
			}else {
				s++;
			}
		}
		System.out.println("Total letters: "+l);
		System.out.println("Total digits: "+d);
		System.out.println("Total whitespaces: "+w);
		System.out.println("Total special characters: "+s);
		sc.close();
	}
}
