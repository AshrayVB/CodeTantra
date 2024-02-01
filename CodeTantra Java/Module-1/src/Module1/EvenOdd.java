//Create a class EvenOdd with main method in it to find whether the number is even or odd.
//Constraints :
//Do not use the Modulus operator.
//If the number is even print Even otherwise print Odd.
//If the number is negative then print Error : Invalid Input.
//Note : All Inputs will be given as command line arguments.
//Test case 1
//	Command line arguments: 
//	2
//	Even⏎	
//Test case 2
//	Command line arguments: 
//	9
//	Odd⏎	
//Test case 3
//	Command line arguments: 
//	-1
//	Error·:·Invalid·Input⏎

package Module1;

import java.util.*;


public class EvenOdd{
	public static void main(String[] str)
	{
		int i=Integer.parseInt(str[0]);
		if((i/2)*2==i)
		System.out.println("Even");
		else if (i<0)
			System.out.println("Error : Invalid Input");
		else
		System.out.println("Odd");
	}
}
