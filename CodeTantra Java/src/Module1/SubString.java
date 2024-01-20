// Write a program to find the length of the string and print the second half of the string.
//     Test case 1
//         Enter·a·string:·Programming	
//         Length·of·the·string·Programming·is:·11⏎	
//         Sub·string·is:·amming
//     Test case 2
//         Enter·a·string:·Thankyou	
//         Length·of·the·string·Thankyou·is:·8⏎	
//         Sub·string·is:·kyou

package Module1;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the length of the string
        int lengthOfString = inputString.length();
        System.out.println("Length of the string " + inputString + " is: " + lengthOfString);

        // Print the second half of the string
        int middleIndex = lengthOfString / 2;
        String secondHalf = inputString.substring(middleIndex);
        System.out.println("Sub-string is: " + secondHalf);

        // Close the scanner
        scanner.close();
    }
}
