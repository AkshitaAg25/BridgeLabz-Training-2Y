import java.util.Scanner;

public class SumOfn {
    public static int sum(int num){
        int s=0;
        for(int i=1;i<=num;i++){
            s+=i;
        }
        return s;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = inp.nextInt();
        int result = sum(num);
        System.out.print("The sum is "+result);
        inp.close();
    }
}
