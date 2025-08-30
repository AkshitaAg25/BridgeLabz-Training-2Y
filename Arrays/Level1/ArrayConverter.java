import java.util.Scanner;

public class ArrayConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter element at [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int[] singleDimensionArray = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleDimensionArray[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("The elements of the 2D array copied to a 1D array are:");
        for (int i = 0; i < singleDimensionArray.length; i++) {
            System.out.print(singleDimensionArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}