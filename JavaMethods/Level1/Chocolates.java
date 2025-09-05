import java.util.Scanner;

public class Chocolates {
    public static int countchoco(int n, int m){
        int each = n / m;
        return each;
    }
    public static int countremainig(int n, int m){
        int remain = n % m;
        return remain;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        
        //take input of number of children and chocolates
        System.out.print("Enter number of children: ");
        int n = inp.nextInt();
        System.out.print("Enter number of children: ");
        int m = inp.nextInt();
        
        //
        int each_get = countchoco(n,m);
        int remaining = countremainig(n, m);
        System.out.println("Each child will get "+each_get+" chocolates");
        System.out.print("Remaining Chocolates are "+remaining);
        inp.close();
    }
}
