package lambda;

import java.util.Scanner;

interface Triggers{
	String run(boolean left, boolean morning, boolean on);
}

public class SmartHome {
	public static void main(String[] args) {
		
		Triggers voice = (a,b,c) -> (!b & c?"lights on":"lights off");
		Triggers color = (a,b,c) -> (!b& c?"warm lights on":"");
		Triggers motion = (a,b,c) -> (a?"direction of light is left":"direction of light is right");
		Scanner inp = new Scanner(System.in);
		String n = inp.next();
		if (n.equals("motion")){
			System.out.println(motion.run(false, false, true));
        }
        else if (n.equals("Afternoon")) {
        	System.out.println(color.run(false, false, true));
        }
        else if (n.equals("Voice")) {
        	System.out.println(voice.run(false, false, true));
        }
		inp.close();
	}
}