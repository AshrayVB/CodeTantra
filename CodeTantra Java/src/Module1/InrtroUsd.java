// Write a program to convert rupees to dollars. 60 rupees=1 dollar. 
// Sample Test Cases
//     Test case 1
//         Enter·INR·to·convert·into·USD:·870	
//         USD:·14.5
//     Test case 2
//         Enter·INR·to·convert·into·USD:·60	
//         USD:·1.0

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
