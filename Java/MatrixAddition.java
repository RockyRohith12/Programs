import java.util.Scanner;

public class MatrixAddition {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for the first matrix:");
        System.out.print("Number of rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Number of columns: ");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter element at (" + i + "," + j + "): ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEnter dimensions for the second matrix:");
        System.out.print("Number of rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Number of columns: ");
        int cols2 = scanner.nextInt();

        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
            // Exit the program if dimensions don't match
        }

        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter element at (" + i + "," + j + "): ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] sumMatrix = new int[rows1][cols1]; // Result matrix

        // Perform matrix addition
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\nResultant Matrix (Sum):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println(); // New line for each row
        }

        scanner.close(); // Close the scanner
    }
}
