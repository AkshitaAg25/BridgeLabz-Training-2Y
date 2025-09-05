import java.util.Scanner;

public class LargeSmallNum {
    public static int[] check(int num1, int num2, int num3){
        int large = num1;
        int small = num1;
        if(num2 < small ){
            small = num2;
        }if(num2 > large){
            large = num2;
        }
        if (num3 < small){
            small = num3;
        }if(num3 > large){
            large = num3;
        }
        return new int[]{large, small};
    }
    public static void main(String args[]){

        //Take input of numbers
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = inp.nextInt();
        System.out.print("Enter num2: ");
        int num2 = inp.nextInt();
        System.out.print("Enter num3: ");
        int num3 = inp.nextInt();
        int result[] = check(num1, num2, num3);
        System.out.println("the largest number is "+result[0]);
        System.out.print("The smallest number is "+result[1]);
        inp.close();
    }
}
