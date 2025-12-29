package com.contructorandinstancevariables.level1;

public class BankAccount {
       public long accountNumber;
       protected String accountHolder;
       private long balance;
       
       public BankAccount(long accountNumber,String accountHolder,long balance) {
    	   this.accountNumber = accountNumber;
    	   this.accountHolder = accountHolder;
    	   this.balance = balance;
       }
       public void setBalance(long balance) {
    	   this.balance = balance;
       }
       public long getBalance() {
    	   return this.balance;
       }
}