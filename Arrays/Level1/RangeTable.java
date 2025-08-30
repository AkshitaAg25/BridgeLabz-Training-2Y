import java.util.Scanner;

public class RangeTable {
    public static void main(String args[]){
        //Declare array 
        int arr[]=new int[3];
        //input number
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();

        //Store answer
        for(int i=0;i<3;i++){
            arr[i]=num*(i+6);
        }
        
        //print table
        for(int i=0;i<3;i++){
            System.out.println(num+"*"+(i+6)+"="+arr[i]);
        }
        in.close();
    }
}
