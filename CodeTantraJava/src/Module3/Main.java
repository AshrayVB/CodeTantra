package Module3;

import java.util.Scanner;
public class Main{
		private int accountNumber;
		private double balance;
		private static final double MINIMUM_BALANCE = 100.0;
		public Main(int accountNumber,double balance){
			this.accountNumber=accountNumber;
			this.balance=balance;
		}
		public void withdraw(double amount) throws InsufficientFundException{
			if(balance - amount < MINIMUM_BALANCE){
				throw new InsufficientFundException("Insufficient Fund Exception");
			} else {
				balance -= amount;
			}
		}
		
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter account number:");
			int accountNumber=sc.nextInt();
			System.out.print("Enter initial balance:");
			double balance=sc.nextDouble();
			Main account=new Main(accountNumber,balance);
			System.out.print("Enter withdrawal amount:");
			double amount=sc.nextDouble();
			try{
				account.withdraw(amount);
				System.out.println("Withdrawn:" + amount);
				System.out.println("New Balance:" + account.balance);
			}
			catch (InsufficientFundException e){
					System.out.println("Error:" + e.getMessage());
				}
		}
	}
class InsufficientFundException extends Exception{
		public InsufficientFundException(String message){
			super(message);
		}
	}