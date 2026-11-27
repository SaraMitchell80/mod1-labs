package lab02;

public class Program {

	public static void main(String[] args) {
		Account myAcc = new Account(1, "Sara", 500.00);
		System.out.println(myAcc.getDetails());
		
		myAcc.Deposit(150.00);
		myAcc.Withdraw(200.00);
		myAcc.Deposit(-50.00);
		myAcc.Withdraw(1000.00);
		System.out.println(myAcc.getDetails());

	Account[] account = new Account[3];
	account[0] = new Account(101, "Alice", 250.00);
	account[1] = new Account(102, "Bob", 1200.50);
	account[2] = new Account(103, "Ben", 75.00);
	
	System.out.println("\n--- All Accounts ---");
    for (Account acc : account) {
        System.out.println(acc.getDetails());
    	}
    
    Account myAccount = new Account(201, "Bella", 100.00);
    myAccount.AddInterest();
    System.out.println(myAccount.getDetails());
    Account partnerAccount = myAccount;
    partnerAccount.AddInterest();
    System.out.println(myAccount.getDetails());
	
	processAccount(myAccount);
    System.out.println("After processAccount: " + myAccount.getDetails());
	
    int k = 100;
    incInt(k);
    System.out.println("Value of k after incInt: " + k);
	}
	
	static void processAccount(Account acc) {
        acc.AddInterest();
    }

    private static void incInt(int x) {
        x++;
    }
}