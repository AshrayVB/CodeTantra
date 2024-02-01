package Module1;
import java.util.Scanner;

class CapitalWordsCounter{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter a line: ");
		s = in.nextLine();
		
		char c;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if ( c >= 65 && c <= 90) {
				count++;
			}
		}
		System.out.println("Capital letters: "+count);
	}
}