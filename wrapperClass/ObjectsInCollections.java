package wrapperClass;

import java.util.ArrayList;

public class ObjectsInCollections {
	public static void main(String[] args) {
		double[] prices = {10.5, 20.0, 35.75, 5.5};
		ArrayList<Double> list = new ArrayList<>();
		double sum=0;
		for(Double d:prices) {
			list.add(d);
			sum+=d;
		}
		System.out.println("The list is: "+list);
		double max=list.get(0);
		for(int i=0;i<list.size();i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		System.out.println("The highest price is: "+max);
		System.out.println("Average: "+sum/list.size());
	}
}
