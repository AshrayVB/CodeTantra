package Module1;
import java.util.Scanner;

public class CapitalWordsCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a line
	        System.out.print("Enter a line: ");
	        String inputLine = scanner.nextLine();

	        // Count the number of words starting with capital letters
	        int capitalWordsCount = countCapitalWords(inputLine);

	        // Display the result
	        System.out.println("Capital letters: " + capitalWordsCount);

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to count the number of words starting with capital letters
	    private static int countCapitalWords(String line) {
	        String[] words = line.split("\\s+"); // Split the line into words
	        int count = 0;

	        for (String word : words) {
	            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
	                count++;
	            }
	        }

	        return count;
	    }
	}

