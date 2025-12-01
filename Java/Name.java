import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        try {
            String firstThree = name.substring(0, 3); 

            int num = Integer.parseInt(firstThree);  
            System.out.println("Converted number: " + num);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must contain at least 3 characters!");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters must be digits!");
        }
    }
}
