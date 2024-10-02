package Exercises;
import java.util.Scanner;

public class FactorizeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to factorize:");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Loop to find and print factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
