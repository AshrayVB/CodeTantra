package Module4;

class MyThread implements Runnable{
	private Object obj;
	public MyThread(Object obj){
		this.obj=obj;
	}
public void run(){
	synchronized (obj){
		System.out.println("["+Thread.currentThread().getName()+"]");
	}
}
}
public class Synch1{
	public static void main(String[] args){
		Object obj=new Object();
		Thread t1=new Thread(new MyThread(obj),"Hello");
		Thread t2=new Thread(new MyThread(obj),"World");
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("[Synchronized]");
	}
}