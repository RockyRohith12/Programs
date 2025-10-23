import java.util.Scanner;
public class Input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print your number:");
        int num=sc.nextInt();
        System.out.println("Your Entered number is :"+num);
        sc.close();
        
    }
}
