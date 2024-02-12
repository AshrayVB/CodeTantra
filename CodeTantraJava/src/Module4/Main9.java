package Module4;

import java.util.*;
class even extends Thread{
	int e;
	public even(int e){
		this.e=e;
	}
	public void run(){
		for(int i=2;i<=e;i=i+2){
			System.out.println("Even:"+i);
		}
	}
}
class odd extends Thread{
	int o;
	public odd(int o){
		this.o=o;
	}
	public void run(){
		for(int i=1;i<=o;i=i+2){
			System.out.println("Odd:"+i);
		}
	}
}
public class Main9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maximum even number:");
		int n=sc.nextInt();
		even t2=new even(n);
		System.out.println("Enter the maximum odd number:");
		int o=sc.nextInt();
		odd t1=new odd(o);
		t1.start();
		t2.start();
	}
}