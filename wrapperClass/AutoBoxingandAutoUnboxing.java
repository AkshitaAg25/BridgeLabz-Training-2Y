package wrapperClass;

import java.util.ArrayList;

public class AutoBoxingandAutoUnboxing {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);	//int 11 is autoboxed to integer
		list.add(12);
		list.add(13);
		list.add(10);
		list.add(9);
		System.out.println("Numbers: "+list);
		
		int sum=0;
		for (Integer num:list) {
			sum+=num;
		}
		System.out.println("Sum of numbers = "+sum);
	}
}
