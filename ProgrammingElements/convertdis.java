 package ProgrammingElements;

public class convertdis {
    public static void main(String[] args) {
        double km=10.8;
        final double CONVERSION_FACTOR = 0.621371;

        // Calculate the distance in miles
        double miles = km * CONVERSION_FACTOR;

        // Print the result
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
    }
    }

