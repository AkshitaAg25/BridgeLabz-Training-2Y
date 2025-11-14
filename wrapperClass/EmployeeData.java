package wrapperClass;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
	public static void main(String[] args) {
		int[] ages= {20,23,45,38,23,32,47};
		ArrayList<Integer> agelist= new ArrayList<>();
		for(int i: ages) {
			agelist.add(i);
		}
		System.out.println("Yongest employee age: "+Collections.min(agelist));
		System.out.println("Oldest employee age: "+Collections.max(agelist));
	}
}
