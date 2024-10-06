package Banking_System;

class Account {
	
	String AccountNo;
	double balance;
	
//	constructor
	
	public Account(String AccountNo, double balance ) {
		
		this.AccountNo = AccountNo;
		this.balance = balance;
		
		System.out.println("Account No. : "+AccountNo);
		System.out.println("Balance : "+balance);
	}
	
//	methods
	
	public void deposits(double amount) {
		
		System.out.println("Deposits Amount Is : "+amount);
		System.out.println("Balance : "+(balance += amount));
	}
	
	public void withdraw(double amount) {
		
		System.out.println("Withdraw Amount Is : "+amount);
		System.out.println("Balance : "+(balance -= amount));
	}
}

class SavingsAccount extends Account{
	
	double interestRate;
	
//	constructor
	
	public SavingsAccount(String AccountNo, double balance, double interestRate) {
		
		super(AccountNo, balance);
		this.interestRate = interestRate;
	}
	
	
//	method 
	
	public void addInterest() {
		
		double interest = balance * (interestRate / 100);
		balance += interest;
		System.out.println("Interest : "+interest);
		System.out.println("Balnce : "+balance);
	}
	
}

class CheckingAccount extends Account {
	
	int overdraftLimit;
	
//	constructor
	
	public CheckingAccount (String AccountNo, double balance, int overdraftLimit) {
		
		super(AccountNo, balance);
		this.overdraftLimit = overdraftLimit;
		
		System.out.println("Overdraft Limit : "+overdraftLimit);
		
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount <= (balance += overdraftLimit)) {
			System.out.println("Withdraw : "+amount);
		} else {
			System.out.println("Withdraw Amount is Greater than balance + Overdreaft Limit : "+amount);
			System.out.println("Withdrawal exceeds overdraft limit");
		}
		
		System.out.println("Balance : "+(balance -= amount));
	}
	
	
	
}



public class BankingSystem {
	
	public static void main(String[] args) {
		
		System.out.println("====================== Banking System ==================== ");
		System.out.println();
		System.out.println();
		
		SavingsAccount sac = new SavingsAccount("ES12345678", 10000, 2.5);
		sac.deposits(5000);
		sac.addInterest();
		sac.withdraw(2000);
		
		System.out.println();
		System.out.println();
		
		CheckingAccount cac = new CheckingAccount("AB23425445", 20000, 5000);
		cac.withdraw(10000);

	}
}