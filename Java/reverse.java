import java.util.*;
public class reverse {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reversed = 0;
        int originalNumber = num;

        while (num != 0) {
            int digit = num % 10;      // Get the last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed number
            num = num / 10;         // Remove last digit
        }

        System.out.println("Reversed number of " + originalNumber + " is " + reversed);
        sc.close();
    }
}
