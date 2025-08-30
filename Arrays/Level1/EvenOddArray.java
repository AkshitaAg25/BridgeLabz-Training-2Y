import java.util.Scanner;

public class EvenOddArray {
    public static void main(String args[]){
        //take number input
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number:");
        int number= in.nextInt();

        //make sure number is natural
        if(number>0){
            //declare two arrays
            int even[]= new int[(number/2)+1];
            int odd[]=new int[number/2+1];
            int e=0;
            int o=0;

            for(int i=1;i<=number;i++){
                if(i%2==0){
                    even[e]=i;
                    e++;
                }else{
                    odd[o]=i;
                    o++;
                }
            }
            System.out.print("Even numbers b/w 1 to "+number+" are:");
            for(int i=0;i<e;i++){
                System.out.print(even[i]+" ");
            }
            System.out.println("");
            System.out.print("Odd numbers b/w 1 to "+number+" are:");
            for(int i=0;i<o;i++){
                System.out.print(odd[i]+" ");
            }

        }else{
            System.out.println("Number entered is not natural");
        }
        
        in.close();
    }
}
