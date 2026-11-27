package lab02;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	void Deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Error: Cannot deposit a zero or negative amount.");
        } else {
            balance += amount;
		}
	}
	
	void Withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Error: Witdrawl amount must be positie.");
		} else if (amount > balance) {
			System.out.println("Error:Insufficient funds.");
		} else {
			 balance -= amount;
		}
	}
	
	public String getDetails() {
		return "ID: " + id + " | Owner: " + owner + " | Balance: £" + balance;
	}
	
	public void AddInterest() {
		balance += balance * 0.025;
	}
}
