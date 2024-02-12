package Module4;

class thread1 extends Thread{
	public void run(){
	System.out.println("New thread: Thread[One,5,main]");
	for(int i=15;i>0;i--){
	System.out.println("One: "+i);
	}
	System.out.println("One exiting.");
	}
}
class thread2 extends Thread{
	public void run(){
	System.out.println("New thread: Thread[Two,5,main]");
	for(int i=15;i>0;i--){
		System.out.println("Two: "+i);
	}
			System.out.println("Two exiting.");
	}
}
public class SuspendResume{
	public static void main(String[] args){
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		try{		
		System.out.println("Suspending thread One");
		t1.suspend();
		t1.resume();
		System.out.println("Resuming thread One");
		}
		catch(Exception e){
			System.out.println(e);
		}
		t2.start();
		try{
			System.out.println("Suspending thread Two");
			t2.suspend();
			t2.resume();
			System.out.println("Resuming thread Two");
			System.out.println("Waiting for threads to finish.");
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Main thread exiting.");
	}
}