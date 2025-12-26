package com.classandobject.level2;

public class BankAccountDetails {
	public static void main(String[] args) {
	       
	       BankAccount account = new BankAccount("Lynda", "123456789", 700.00);
	      
	       account.displayBank();
	      
	       
	       account.displayBalance();
	      
	       account.deposit(200.00);
	       account.displayBalance();
	      
	       account.withdraw(100.00);
	       account.displayBalance();
	      
	       account.withdraw(900.00);

	}
}
