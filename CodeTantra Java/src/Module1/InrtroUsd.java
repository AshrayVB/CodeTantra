package Module1;
import java.util.Scanner;

public class InrtroUsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter INR to convert into USD
        System.out.print("Enter INR to convert into USD: ");
        int inrAmount = scanner.nextInt();

        // Define the exchange rate
        double exchangeRate = 60.0;

        // Convert INR to USD
        double usdAmount = inrAmount / exchangeRate;

        // Display the result
        System.out.println("USD: " + usdAmount);

        // Close the scanner
        scanner.close();
    }
}
