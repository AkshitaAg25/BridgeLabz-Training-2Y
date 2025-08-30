import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args){
        int[] ages=new int[10];
        Scanner in= new Scanner(System.in);
        System.out.println("Enter age of 10 students: ");
        for(int i=0;i<10;i++){
            int age= in.nextInt();
            ages[i]=age;
        }
        for(int i=0;i<10;i++){
            if (ages[i]>=18){
                System.out.println("The student with age "+ages[i]+"can vote");
            }
            else if(ages[i]<18 && ages[i]>0){
                System.out.println("The student with age "+"cannot vote");
            }
            else{
                System.out.println("Invalid age");
            }
        }
        in.close();
    }
}
