package Module3;

import java.util.*;

public class Basic {
	// Define the array with three elements: 1, 2, and 3
    static int[] arr = {1, 2, 3};
    // TODO: Implement the 'func' method
    static void func(int a, int b) {
        try {
            // Call the 'divide' method and print the result of division
            int divisionResult = divide(a);
            System.out.println("Result of division: " + divisionResult);
            // Call the 'getElement' method and print the element at the specified index
            int element = getElement(arr, b);
            System.out.println("Element at index " + b + ": " + element);
        } catch (IllegalArgumentException e) {
            // Handle the exception and print an error message
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
// TODO: Implement the 'divide' method
    static int divide(int a) {
        // Check if 'a' is zero and throw an exception if true, otherwise return the result of division
        if (a == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return 10 / a;
    }

    // TODO: Implement the 'getElement' method
    static int getElement(int[] arr, int index) {
         // Check if the index is out of bounds and throw an exception if true, otherwise return the element
        if (index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Array index out of bounds");
        }
        return arr[index];
    }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                // Read input for num1 and num2
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                // Call the 'func' method with num1 and num2 as arguments
                func(num1, num2);
            } catch (IllegalArgumentException e) {
                // Handle the exception and print an error message
                System.out.println("Invalid input: " + e.getMessage());
            } finally {
                in.nextLine(); // Consume the newline character
			}
        }
        in.close();
    }
}
