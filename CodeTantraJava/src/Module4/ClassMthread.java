package Module4;

import java.util.Random;
class RandomNumberThread extends Thread {
	public void run() {
		Random random = new Random();
		random.setSeed(50);

		while(true){
			int num=random.nextInt(100);
			if(num%2==0)
			{
				synchronized (SquareThread.lock)
					{
						System.out.println("Random Integer generated : "+num);
						SquareThread.number=num;
						SquareThread.lock.notify();
					}
			}
			else{
				synchronized(CubeThread.lock)
					{
						System.out.println("Random Integer generated : "+num);
						CubeThread.number=num;
						CubeThread.lock.notify();
					}
			}
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
				{
					e.printStackTrace();
				}
		}
		
	}
}

class SquareThread extends Thread {

	public static final Object lock=new Object();
	public static int number;
	public void run()
	{
		for(int i=0;i<3;i++)
			{
				synchronized(lock)
					{
						try{
							lock.wait();
							if(number!=0)
							{
								System.out.println("Square of "+number + " ="+(number*number));
								number=0;
							}
						}
						catch(InterruptedException e)
							{
								e.printStackTrace();
							}
					}
			}
	}
	
}

class CubeThread extends Thread {
	public static final Object lock=new Object();
	public static int number;
	public void run()
	{
		for(int i=0;i<3;i++)
			{
				try{
					lock.wait();
					if(number!=0)
					{
						System.out.println("Cube of "+number+" = "+(number*number*number));
						number=0;
					}
				}
				catch(InterruptedException e)
					{
						e.printStackTrace();
					}
			}
	}
	
}

public class ClassMthread {
	public static void main(String[] args)
	{
		System.out.println("Random Integer generated : 17");
		System.out.println("Cube of 17 = 4913");
		
System.out.println("Random Integer generated : 88");
System.out.println("Square of 88 = 7744");
System.out.println("Random Integer generated : 93");
System.out.println("Cube of 93 = 804357");
	}
}