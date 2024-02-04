//Write a class NumberPalindrome with a public method isNumberPalindrome that takes one parameter number of type int. Write a code to check whether the given number is palindrome or not.
//
//For example
//Cmd Args : 333
//333 is a palindrome
//
//
//Note: Please don't change the package name.
//Test case 1
//Command line arguments: 
//333
//333·is·a·palindrome⏎	
//Test case 2
//Command line arguments: 
//567
//567·is·not·a·palindrome⏎



package Module1;

//Filename: NuberPalindrome
class NumberPalindrome {
	public void isNumberPalindrome(int n) {
		int r,sum=0,temp;
		temp=n;
		while(n>0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
		if(temp==sum)
		{
			System.out.println(temp +" is a palindrome");
		}
		else{
			System.out.println(temp +" is not a palindrome");
		}
	}
}

//Filename: NumberPalindromeMain
public class NumberPalindromeMain{
	public static void main(String[] args){
		if (args.length < 1) {
			System.out.println("Usage: java NumberPalindromeMain <number>");
			System.exit(-1);
		}
		try {
			int number = Integer.parseInt(args[0]);
			NumberPalindrome nPalindrome = new NumberPalindrome();
			nPalindrome.isNumberPalindrome(number);
		} catch(NumberFormatException nfe) {
			System.out.println("Usage: java NumberPalindromeMain <number>\n\tage: an integer representing number");
		}
		
	}
}