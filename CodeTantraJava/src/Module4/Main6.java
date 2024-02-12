package Module4;

import java.util.Scanner;

class TablePrinter implements Runnable {
    private int tableNumber;

    public TablePrinter(int tableNumber) {
        this.tableNumber = tableNumber;
    }

   public void run(){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=tableNumber;j++){
			System.out.println(j+" * "+i+" = "+i*j);
			}
		}
	}
}

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tables:");
        int numTables = scanner.nextInt();
        Thread[] threads = new Thread[numTables];
     
        TablePrinter table = new TablePrinter(numTables);
		Thread t1=new Thread(table);
		t1.start();
        
    }
}