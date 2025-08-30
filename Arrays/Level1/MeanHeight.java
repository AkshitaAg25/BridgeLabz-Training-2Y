import java.util.Scanner;

public class MeanHeight {
    public static void main(String args[]){
        //declare array
        double arr[]= new double[11];
        double sum=0.0;
        //take input in array
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of players: ");
        for(int i=0;i<11;i++){
            double height = in.nextDouble();
            arr[i]=height;
            sum+=height;
        }
        double ans=sum/11;
        System.out.println("Mean height of players: "+ans);
        in.close();
    }
}
