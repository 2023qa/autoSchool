package practice2;
import java.util.Scanner;
public class VariableN {

    public static void main(String[] args) {

        // Create a scanner for input from user
        Scanner scanner = new Scanner(System.in);

        //Get input from user (2 digit natural number)
        System.out.println("Please enter a two-digit natural number: ");
        int n = scanner.nextInt();

        // Calculate the sum of digits
        int sumOfDigits = (n%10) + (n/10);

    }

}
