package Module2;

import java.util.Scanner;

class BankAccount {
	String name;
	int number;
	String type;
	float balance;
	
//write your code...
	public BankAccount(String name, int number, String type, int balance) {
		this.name = name;
		this.number = number;
		this.type = type;
		this.balance = (float) balance;
	}
	
	void deposit(int amount) {
		if (amount < 0) {
			System.out.println("Invalid deposit amount");
		} else {
			this.balance += amount;
			System.out.println("Deposit successful. New balance: " + this.balance);
		}
	}
	void withdraw(int amount) {
		if (amount < 0) {
			System.out.println("Invalid withdrawal amount");
		} else if (this.balance < amount) {
			System.out.println("Insufficient balance");
		} else {
			this.balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + this.balance);
		}

	}
	
	void displayAccountDetails() {
		System.out.println("Account Details:");
		System.out.println("Account Holder: "+ this.name);
		System.out.println("Account Number: " + this.number);
		System.out.println("Account Type: " + this.type);
		System.out.println("Balance: " + this.balance);
	}
}

public class ExecuteAccount {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("account holder: ");
		String holder = scan.next();
	
		System.out.print("account number: ");
		int number = scan.nextInt();
	
		System.out.print("account type: ");
		String type = scan.next();
	
		System.out.print("initial balance: ");
		int balance = scan.nextInt();
	
		BankAccount account = new BankAccount(holder, number, type, balance);
		System.out.print("amount to deposit: ");
		int depositAmount=scan.nextInt();
	account.deposit(depositAmount);
	System.out.print("amount to withdraw: ");
		int withdrawAmount=scan.nextInt();
	account.withdraw(withdrawAmount);
    
    account.displayAccountDetails();

	}
	
}	