import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //take input
        System.out.print("Enter number: ");
        int num= in.nextInt();

        //declare array that stores the table output
        int arr[]= new int[10];
         
        //store values in array
        for(int i=0;i<10;i++){
            int mul=num*(i+1);
            arr[i]=mul;
        }

        //print table
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+arr[i-1]);
        }
        in.close();
    }
}
