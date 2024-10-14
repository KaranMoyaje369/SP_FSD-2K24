package Exception_Handling_Tasks;

//Exercise 3: Use Custom Checked Exception

//Write a Java program that demonstrates the use of a custom checked exception by creating a custom exception class called InsufficientFundsException for a bank account scenario.

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}

class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
		}
		balance -= amount;
	}
}

public class Exercise_15 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		try {
			account.withdraw(1500.0);
		} catch (InsufficientFundsException e) {
			System.out.println("InsufficientFundsException caught: " + e.getMessage());
		}
	}
}
