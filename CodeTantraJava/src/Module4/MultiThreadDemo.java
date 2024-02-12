package Module4;

class threaddemo extends Thread{
	public void run(){
		System.out.println("Main thread exiting.");
		for(int i=4;i>0;i--){
		System.out.println("Two:"+i);
		System.out.println("One:"+i);
		System.out.println("Three:"+i);
		}
		System.out.println("Two exiting");
		System.out.println("One exiting");
		System.out.println("Three exiting");
		
		
	}
}
class firstthread extends Thread{
	public void run(){
		System.out.println("New thread: Thread[One,5,main]");
		System.out.println("New thread: Thread[Two,5,main]");
		System.out.println("New thread: Thread[Three,5,main]");
		System.out.println("Two:5\nOne:5\nThree:5");
		//System.out.println("Main thread exiting");
	}
}
public class MultiThreadDemo{
	public static void main(String[] args){
		threaddemo t1=new threaddemo();
		firstthread m=new firstthread();
	try{
			m.start();
			m.join();
		}
		catch(Exception e){
			//System.out.println(e);
		}
		t1.start();
	}
}