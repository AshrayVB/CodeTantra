package Module3;

import java.util.Scanner;
public class StringToInt {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
		try{
			int number=Integer.parseInt(input);
			System.out.println("" + (2 * number));
		}
		catch (NumberFormatException e){
				System.out.println("Error: The input is not a valid integer");
			}
		}
}