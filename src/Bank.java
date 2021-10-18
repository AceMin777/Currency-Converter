import java.util.*;
public class Bank {

	static Scanner change = new Scanner(System.in);

	public static void main(String[] args) {
		
		String yourName;
		String yourId;
		
		System.out.println("Hello Customer. Please enter your Name");
		yourName = change.next();
		
		System.out.println("Please Enter Your ID");
		yourId = change.next();
		
		BankAccount account = new BankAccount(yourName, yourId);
		account.menu();
	}

}

class BankAccount {
	double balance, transaction;
	String customerName, customerId;
	
	BankAccount(String name, String id){
		customerName = name;
		customerId = id;
	}
	
	void deposit(double amount) {
		if(amount != 0) {
			balance += amount;
			transaction = amount;
			System.out.println("Balance: $" + balance);
		}
	}
	
	void withDraw(double amount) {
		if(amount != 0) {
			balance -= amount;
			transaction = amount;
			System.out.println("Balance: $" + balance);
		}
		else
			System.out.println("Insuffiecient Balance");
	}
	
	void getPreviousTransaction() {
		if(transaction > 0) {
			System.out.println("Deposited: " + transaction);
		}
		else if(transaction < 0) {
			System.out.println("Withdrawn: " + transaction);
		}
		else {
			System.out.println("No Transaction in your History");
		}
	}
	
	void menu() {
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("ID: " + customerId);
		System.out.println("\n");
		
		do {
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Transaction");
			System.out.println("E. Exit");
			System.out.println("Type The Option Of What You Would Like To Do");
			option = sc.next().charAt(0);
			System.out.println("\n");
			option = Character.toUpperCase(option);
			switch(option) {
			case 'A': 
				System.out.println("Balance: $" + balance);
				System.out.println("\n");
				break;
			case 'B': 
				System.out.println("How Much Would You Like To Deposit: ");
				double amount = sc.nextDouble();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'C': 
				System.out.println("How Much Would You Like To Withdraw: ");
				amount = sc.nextDouble();
				withDraw(amount);
				System.out.println("\n");
				break;
			case 'D': 
				getPreviousTransaction();
				break;
			case 'E':
				System.out.println("Thank You!");
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		} while(option != 'E');
		
	}
}

//D