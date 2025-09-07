package Level2;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static int recursionsum(int n){
        if(n==1){
            return 1;
        }
        return n + recursionsum(n-1);
    }
    public static int formulasum(int n){
        return n*(n+1)/2;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number");
        int n = inp.nextInt();
        // output using recursion
        int recursion = recursionsum(n);
        //output of formula
        int formula = formulasum(n);
        //Check if same
        if(recursion==formula){
            System.out.print("The result is same "+formula);
        }else{
            System.out.print("the result is different");
        }
        inp.close();
    }
}
