package Module4;

class ProdCons
{
	public static void main(String args[])
	{
	    Product p=new Product();
     	new Producer(p);
        new Consumer(p);
	}
}

class Product
{
private int value;
    private boolean available = false;

    synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("GET:" + value);
        available = false;
        notify();
        return value;
    }

    synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        System.out.println("PUT:" + value);
        available = true;
        notify();
	}
}
class Producer implements Runnable
{
private Product product;

    Producer(Product product) {
        this.product = product;
        Thread t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            product.put(i);
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}
class Consumer implements Runnable
{
private Product product;

    Consumer(Product product) {
        this.product = product;
        Thread t2 = new Thread(this);
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            product.get();
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}