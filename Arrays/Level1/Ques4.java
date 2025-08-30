import java.util.Scanner;

public class Ques4 {
    public static void main(String args[]){
        //Declare array
        double arr[]= new double[10];
        //declare a variable for sum
        double sum=0.0;

        //Take input
        Scanner in= new Scanner(System.in);
        //using while loop since we want to take input untill input is not 0 or -ve
        int i=0;
        int c=0;
        System.out.println("Enter numbers:");
        while(true){
            double num= in.nextDouble();
            c++;
            if(num<=0 || c==10){
                break;
            }else{
                arr[i]=num;
                i++;
            }
        }
        //sum of elements in array
        for(int j=0;j<i;j++){
            sum+=arr[j];
        }
        System.out.println("sum is "+sum);
        System.out.println(arr[i-1]);
        in.close();
    }
}
