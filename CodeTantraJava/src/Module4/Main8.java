package Module4;

import java.io.*;
import java.util.*;
class PrimeThread extends Thread {
 private int N;
    private PipedOutputStream output;

    public PrimeThread(int N, PipedOutputStream output) {
        this.N = N;
        this.output = output;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public void run() {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(output), true);

        for (int i = 2; i < N; i++) {
if(isPrime(i))
{
writer.println(i);
}
		}
writer.close();
	}
}

class FibonacciThread extends Thread {

	private int N;
private PipedOutputStream output;
public FibonacciThread(int N,PipedOutputStream output)
	{
this.N=N;
this.output=output;
	}


    public void run() {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(output), true);

        int a = 0, b = 1, c;
        while (a < N) {
            if (a > 1) {
                writer.println(a);
            }
            c = a + b;
            a = b;
            b = c;
        }

        writer.close();
	}
}

public class Main8 {
	 public static void main(String[] args) throws IOException {
Scanner scanner = new Scanner(System.in);
               System.out.print("Enter the value of N: ");
       int N = scanner.nextInt();
PipedInputStream primeInputStream = new PipedInputStream();

PipedInputStream fibonacciInputStream = new PipedInputStream();
       PipedOutputStream primeOutputStream = new PipedOutputStream(primeInputStream);
       PipedOutputStream fibonacciOutputStream = new PipedOutputStream(fibonacciInputStream);

       PrimeThread primeThread = new PrimeThread(N, primeOutputStream);
       FibonacciThread fibonacciThread = new FibonacciThread(N, fibonacciOutputStream);

       primeThread.start();
       fibonacciThread.start();

       Set<Integer> primeSet = new HashSet<>();
       Set<Integer> fibonacciSet = new HashSet<>();

       Scanner primeScanner = new Scanner(primeInputStream);
       Scanner fibonacciScanner = new Scanner(fibonacciInputStream);

       while (primeScanner.hasNext()) {
           primeSet.add(primeScanner.nextInt());
       }

       while (fibonacciScanner.hasNext()) {
           fibonacciSet.add(fibonacciScanner.nextInt());
       }

       primeScanner.close();
       fibonacciScanner.close();

       primeInputStream.close();
       fibonacciInputStream.close();

       primeThread.interrupt();
       fibonacciThread.interrupt();

       Set<Integer> commonNumbers = new HashSet<>(primeSet);
       commonNumbers.retainAll(fibonacciSet);

       System.out.println("Numbers that are both prime and Fibonacci:");
       System.out.println(commonNumbers);
	 }
}