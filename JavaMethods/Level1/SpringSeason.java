import java.util.Scanner;

public class SpringSeason {
    public static void check(int month, int day){
        if(month==3){
            if(day>=20){
                System.out.println("Spring");
            }else{
                System.out.println("Not a Spring Season");
            }
        }else if(month==4){
            System.out.println("Its a spring Season");
        }else if(month==5){
            if(day<=20){
                System.out.println("Spring");
            }else{
                System.out.println("Not a Spring Season");
            }
        }else{
            System.out.println("Not a Spring Season");
        }
    }
    public static void main(String args[]){
        Scanner inp =new Scanner(System.in);
        System.out.print("Enter month number");
        int month = inp.nextInt();
        System.out.print("Enter date: ");
        int day = inp.nextInt();
        check(month,day);
        inp.close();
    }
}
