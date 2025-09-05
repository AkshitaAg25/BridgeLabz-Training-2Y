import java.util.Scanner;

public class QuotientReminder {
    public static int quotient(int num, int divisor){
       int quot = num / divisor ;
       return quot;
    }
    public static int reminder(int num, int divisor){
        int remin = num % divisor ;
        return remin ;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = inp.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = inp.nextInt();

        //call division function
        int quot = quotient(num, divisor);
        //call reminder function
        int remi = reminder(num, divisor);
        //print
        System.out.println("The quotient is "+quot);
        System.out.print("The reminder is "+remi);
        inp.close();
    }
}
