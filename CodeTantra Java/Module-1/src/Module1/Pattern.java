//Write an interactive program to print a string entered in pyramid form.
//Test case 1
//	Enter·a·string:·OliVeR	
//	······O··⏎	
//	·····O·l··⏎	
//	····O·l·i··⏎	
//	···O·l·i·V··⏎	
//	··O·l·i·V·e··⏎	
//	·O·l·i·V·e·R··⏎
//Test case 2
//	Enter·a·string:·AmeLiA	
//	······A··⏎	
//	·····A·m··⏎	
//	····A·m·e··⏎	
//	···A·m·e·L··⏎	
//	··A·m·e·L·i··⏎	
//	·A·m·e·L·i·A··⏎



package Module1;

import java.util.*;
public class Pattern{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char c;
		System.out.printf("Enter a string: ");
		String s = new String();
		s= in.nextLine();
		int l=s.length();
		for(int i=0;i<s.length();i++){
			for(int j =(l/2)+2;j>=i;j--)
				{
					System.out.print(" ");
				}
			for(int k=0;k<=i;k++){
				c=s.charAt(k);
				System.out.print(c+" ");
			}
				System.out.println(" ");
	}
}
}