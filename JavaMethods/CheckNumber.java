import java.util.Scanner;

public class CheckNumber{
    public static void check(int num){
        if(num>0){
            System.out.print("Positive");
        }else if(num<0){
            System.out.print("Negative");
        }else{
            System.out.print("Zero");
        }
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = inp.nextInt();
        check(num);
        inp.close();
    }
}