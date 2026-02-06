package multithreading.bankingsystem;

import java.time.LocalTime;

public class Bank {
	private String customerName;
     private double balance;
     
     public Bank(double balance,String customerName) {
    	 this.balance = balance;
    	 this.customerName = customerName;
     }

	 public double getBalance() {
		 return balance;
	 }

	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
     
     public void viewBalance() {
    	 System.out.println("\n["+this.customerName+"] You Account Balance is : "+this.balance);
    	 System.out.println("Time : "+LocalTime.now());
     }
     
     public synchronized void credidate(double amount) {
    	try { this.balance+=amount;
    	System.out.println("\nSuccessFully Added : "+amount);
    	System.out.println("Time : "+LocalTime.now() );
    	System.out.println("Acoount Balance is : "+this.balance);
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    	}
     }
     
     public synchronized void withdrawal(double amount) {
    	 if(amount>this.balance) {
    		 System.out.println("Insufficient Balance !! ");
    		 return;
    	 }
    	 try {
    		 this.balance-=amount;
    		 System.out.println("\n["+this.customerName+"] Successfully amount dedidate "+amount);
    		 System.out.println("Time : "+LocalTime.now());
    		 System.out.println("Account Balance is : "+this.balance);
    	 }catch(Exception e) {
    		 System.out.println(e.getMessage());
    	 }
     }
}