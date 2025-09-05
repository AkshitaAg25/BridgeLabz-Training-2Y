import java.util.Scanner;

public class TriangularPark {
    public static double rounds(double s, double s2, double s3){
        double parameter= s+s2+s3;
        double ans= 5000/parameter;
        return ans;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter sides of triangular park(in meters): ");
        double s1= inp.nextDouble();
        double s2=inp.nextDouble();
        double s3 = inp.nextDouble();
        double result = rounds(s1,s2,s3);
        System.out.print("Number of rounds are: "+result);
        inp.close();
    }
}
