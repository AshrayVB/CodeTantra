package Module4;

import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class StackThreads{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the stack");
			int size=sc.nextInt();
			int i;
			Stack<Integer> stack=new Stack<>();
			for(i=0;i<size;i++){
					System.out.println(i+1);
				}
		}
	}