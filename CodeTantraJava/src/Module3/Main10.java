package Module3;

import java.util.Scanner;
interface EvenChecker {
	boolean isEven(int n);
	
}
//cahnge Main10 to Main
public class Main10 {
    public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
        
        EvenChecker evenChecker = (num) -> num%2 == 0;

		if (evenChecker.isEven(number)) {
			System.out.println(number + " is an even number");
		} else {
			System.out.println(number + " is an odd number");
		}
    }
}