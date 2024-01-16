// Write a program that calculates the percentage marks of the student if marks in 6 subjects are given.
// Sample Test Cases
	// Test case 1
	//	 Enter·the·marks·for·subject1:·56	
		// Enter·the·marks·for·subject2:·87	
		// Enter·the·marks·for·subject3:·29	
		// Enter·the·marks·for·subject4:·55	
		// Enter·the·marks·for·subject5:·36	
		// Enter·the·marks·for·subject6:·48	
		// Percentage:·51.0
	// Test case 2
		// Enter·the·marks·for·subject1:·85	
		// Enter·the·marks·for·subject2:·66	
		// Enter·the·marks·for·subject3:·97	
		// Enter·the·marks·for·subject4:·85	
		// Enter·the·marks·for·subject5:·69	
		// Enter·the·marks·for·subject6:·98	
		// Percentage:·83.0

package Module1;
import java.util.Scanner;

	public class Percentage {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter marks for each subject
	        System.out.print("Enter the marks for subject1: ");
	        int subject1 = scanner.nextInt();

	        System.out.print("Enter the marks for subject2: ");
	        int subject2 = scanner.nextInt();

	        System.out.print("Enter the marks for subject3: ");
	        int subject3 = scanner.nextInt();

	        System.out.print("Enter the marks for subject4: ");
	        int subject4 = scanner.nextInt();

	        System.out.print("Enter the marks for subject5: ");
	        int subject5 = scanner.nextInt();

	        System.out.print("Enter the marks for subject6: ");
	        int subject6 = scanner.nextInt();

	        // Calculate the total marks and percentage
	        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
	        int percentage = (int) totalMarks / 6;

	        double per = (double) percentage;
	        
	        // Display the result
	        System.out.println("Percentage: " + per);

	        // Close the scanner
	        scanner.close();
	    }
	}

