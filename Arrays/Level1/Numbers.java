import java.util.Scanner;

public class Numbers {
    public static void main(String args[]){
        //Create array
        int arr[]= new int[5];

        //take input in array
        Scanner in= new Scanner(System.in);
        for(int i=0;i<5;i++){
            int num= in.nextInt();
            arr[i]=num;
        }

        //check if number is positive,negative,even odd
        for(int i=0;i<5;i++){
            if(arr[i]>0 && arr[i]%2==0){
                System.out.println("positive and even");
            }
            else if(arr[i]>0 && arr[i]%2!=0){
                System.out.println("positive and odd");
            }
            else if(arr[i]<0){
                if(arr[i]%2==0){
                    System.out.println("Negative and even");
                }
                else if(arr[i]%2!=0){
                    System.out.println("Negative and odd");
                }
            }
        }
        if(arr[0]==arr[4]){
            System.out.println("Last two are equal");
        }else if(arr[0]>arr[4]){
            System.out.println("Last first number is greater than last number");
        }else{
            System.out.println("Last number is greater than first number");
        }
        in.close();
    }
}
