package Module3;

import java.util.*;

public class Basic {
	public static void main(String args[]){
		Scanner ob =new Scanner(System.in);
		int n=ob.nextInt();
		int a,b,c;
		ArrayList<Integer>
			al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		for(int i=0;i<n;i++){
			a=ob.nextInt();
			b=ob.nextInt();
			try{
				if(a==0){
					throw new ArithmeticException();
				}
				System.out.println("Result of division: "+10/a);
				if(b>n){
					throw new IndexOutOfBoundsException();
				}
				System.out.println("Element at index "+b+": "+al.get(b));
			}
				catch(ArithmeticException e){
					System.out.println("Invalid input: Cannot divide by zero");
				}
			catch(IndexOutOfBoundsException e1){
				System.out.println("Invalid input: Array index out of bounds");
			}
		}
	}
}