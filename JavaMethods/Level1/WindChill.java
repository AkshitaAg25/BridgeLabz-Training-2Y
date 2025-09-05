import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temp,double windspeed){
        double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windspeed, 0.16);
        return windChill;
    }
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        //input windspeed and temperature
        System.out.print("Enter Temperature: ");
        double temp = inp.nextDouble();
        System.out.print("Enter wind speed: ");
        double windspeed = inp.nextDouble();
        
        //use function
        double windchill = calculateWindChill(temp, windspeed);
        //output
        System.out.print("The wind chill is "+windchill);
        inp.close();
    }
}
