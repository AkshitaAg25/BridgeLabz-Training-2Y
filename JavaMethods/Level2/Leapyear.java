import java.util.Scanner;

public class Leapyear {
    public static void checkyear(int year){
        if(year>=1582){
            if(year%4==0){
                if(year%100!=0 || year %400==0){
                    System.out.print("The year is leap year");
                }else{
                    System.out.print("The year is not leap year");
                }
            }else{
                System.out.print("The year is not leap year");
            }
        }else{
            System.out.print("The year is not leap year");
        }
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = inp.nextInt();
        checkyear(year);
        inp.close();
    }
}
