import java.util.Scanner;

public class Handshakes {
    public static int combinationFormula(int n){
        int ans= (n*(n-1))/2;
        return ans;
   }
    public static void main(String args[]){
        Scanner inp= new Scanner(System.in);
        System.out.print("enter number of students: ");
        int numberOfStudents = inp.nextInt();
        int result = combinationFormula(numberOfStudents);
        System.out.print("Number of possible handshakes are: "+result);
        inp.close();
    }
}
