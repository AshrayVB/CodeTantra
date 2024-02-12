package Module3;
import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeBasic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		try {
			if (age < 0 || age > 150) {
				throw new InvalidAgeException("Invalid age");
			} else {
				System.out.println("Valid age: " + age + " years");
			}
		}
		catch(InvalidAgeException e)
			{
				System.out.println("Error: " + e.getMessage());
			}
	}
}