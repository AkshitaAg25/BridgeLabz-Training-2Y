package Level2;

import java.util.Scanner;

public class FactorsOfNumber {
    public static int[] findfactors(int num){
        //count number of factors
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        //declare factor array
        int factor[] = new int[count];
        int c=0;
        //Store factors in array
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factor[c]=i;
                c++;
            }
        }
        return factor;
    }
    public static int sum(int[] factors){
        int summ=0;
        for(int i=0;i<factors.length;i++){
            summ+=factors[i];
        }
        return summ;
    }
    public static int product(int[] factors){
        int prod = 1;
        for(int i=0;i<factors.length;i++){
            prod*=factors[i];
        }
        return prod;
    }
    public static int sumofsquares(int[] factors){
        int summ = 0;
        for(int i=0;i<factors.length;i++){
            summ+=Math.pow(factors[i],2);
        }
        return summ;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        //Take input
        System.out.print("Enter a number: ");
        int num = inp.nextInt();
        //getting factors
        int factors[]=findfactors(num);

        //printing factors
        System.out.print("the factors are: ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+", ");
        }
        
        System.out.println();
        //print sum of factors
        System.out.println("The sum of factors is "+sum(factors));
        //print the product of factors
        System.out.println("The product of factors is "+product(factors));
        //print the sum of square of factors
        System.out.println("The sum of squares of factors is "+sumofsquares(factors));


        inp.close();
    }
}
