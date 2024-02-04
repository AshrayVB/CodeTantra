package Module1;

import java.util.Scanner;
public class SortNames{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of names you want to enter: ");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.print("Enter the names: ");
		for(int i=0;i<n;i++){
				str[i]=new String(sc.next());
			}
		for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
						if(str[i].compareTo(str[j])>0){
							String temp=str[i];
							str[i]=str[j];
							str[j]=temp;
						}
					}
			}
		System.out.print("Sorted names:");
		for(int i=0;i<n;i++){
				System.out.print( str[i]+" " );
			}
	}
}