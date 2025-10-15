package lambda;

import java.util.Scanner;

@FunctionalInterface
interface Predicate{
	void noti_filter();
}

public class Filter {
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	String n = inp.next();
	Predicate red = ()-> System.out.println("Red Alert: Very importanat message");
	Predicate yellow = ()-> System.out.println("Yellow Alert: importanat message");
	Predicate green = ()-> System.out.println("Green Alert: not so importanat message");
	
	if(n.equals("red")){
        red.noti_filter();
    }
    else if (n.equals("yellow")) {
        yellow.noti_filter();
    }
    else if (n.equals("green")) {
        green.noti_filter();
    }
    inp.close();
	}
}