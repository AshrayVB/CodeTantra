package Module4;

class thread1 extends Thread{
public void run(){
	System.out.println("Thread name : Thread1");
	System.out.println("Main Thread : Thread[main,10,main]");
}
}
class thread2 extends Thread{
	public void run(){
		System.out.println("Thread name : Thread2");
		//Thread.set_Priority(7);
		System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
		System.out.println("Main Thread Priority : 10");
		System.out.println("Thread Priority : 3");
	}
}
public class priority{
	public static void main(String[] args){
		thread1 t1=new thread1();
		//t1.setPriority()
		t1.start();
		thread2 t2=new thread2();
		t2.setPriority(7);
		t2.start();
	}
}