import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        int total = rows * (rows + 1) / 2; 
        int[][] left = new int[rows][rows];
        int[][] right = new int[rows][rows];

        int count = 1;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                left[i][j] = count++;
            }
        }

       
        count = total + 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                right[i][j] = count++;
            }
        }   

        for (int i = 0; i < rows; i++) {
           
            for (int s = 0; s < i * 2; s++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j < rows - i; j++) {
                System.out.print(left[i][j]);
                System.out.print("*");
            }

            
            for (int j = 0; j < rows - i; j++) {
                System.out.print(right[i][j]);
                if (j < rows - i - 1)
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}
