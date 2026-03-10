package task_01;
public class BankAccount { // Crates the public class BankAccount
	private float balance = 0; // Initialises balance attribute as a private float with an initial value of 0
	private int accountNumber = 0; // Initialises accountNumber attribute as a private integer with an initial value of 0
	private String sortcode = ""; // Initialises sortcode attribute as a private empty string
	public void deposit(float amount) { // Adds to the balance attribute the number in amount or inputed by the user
		this.balance += amount;
	}
	public void withdraw(float amount) { // Subtracts from the balance attribute the number in amount or inputed by the user
		this.balance -= amount;
	}
	public String summarise() { // Return a single line string containing the account number, sortcode and balance
		String txt = "Account Number: " + this.accountNumber + " Sort: " + this.sortcode + " Balance: $" + this.balance;
		return txt;
	}
	public void setBalance(float b) { // Sets balance to the number in b
		this.balance = b;
	}
	public void setAccountNumber(int n) { // Sets accountNumber to the number in n
		this.accountNumber = n;
	}
	public void setSortcode(String s) { // Sets sortcode to the string s
		this.sortcode = s;
	}
	public float getBalance() { // returns the value held in balance
		return this.balance;
	}
	public int getAccountNumber() { // returns the value held in accountNumber
		return this.accountNumber;
	}
	public String getSortcode() { // returns the value held in sortcode
		return this.sortcode;
	}
}