package Module3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample{
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int firstNumber,secondNumber;

        try {
			firstNumber=scanner.nextInt();
			secondNumber=scanner.nextInt();
			System.out.println(firstNumber+secondNumber);
        } catch (InputMismatchException e) {
            // Handle the InputMismatchException
            System.out.println("Error: Input must be valid integers.");
        }

    }
}