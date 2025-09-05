import java.util.Scanner;

class SimpleInterest {
    public static double formula(double p, double r, double t){
        double ans = (p*r*t)/100;
        return ans;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter principle");
        double p = inp.nextDouble();
        System.out.print("Enter rate: ");
        double r = inp.nextDouble();
        System.out.print("Enter time: ");
        double t = inp.nextDouble();

        double result = formula(p, r, t);
        System.out.print("the answer is "+result);
        inp.close();
    }
}
