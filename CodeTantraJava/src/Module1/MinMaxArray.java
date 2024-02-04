//Find Minimum and Maximum in an array
package Module1;

import java.util.*;

public class MinMaxArray{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
			int n=sc.nextInt();
			int [] a=new int[n];
			System.out.print("Enter array elements: ");
				for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				}
			int max=a[0];
			int min=a[0];
			for(int i=1;i<a.length;i++)
				{
					if(a[i]<min){
						min=a[i];
					}else if(a[i]>max){
						max=a[i];
					}
				}
			System.out.println("Mimimum element in array is: "+min);
			System.out.println("Maximum element in array is: "+max);
			sc.close();
		}
}