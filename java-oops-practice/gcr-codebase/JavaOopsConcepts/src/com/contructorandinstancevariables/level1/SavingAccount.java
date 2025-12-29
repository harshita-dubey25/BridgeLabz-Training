package com.contructorandinstancevariables.level1;

public class SavingAccount extends BankAccount{
        
	public SavingAccount(long a,String n, long b) {
		super(a,n,b);
	}
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1233l,"Lucky",5000l);
		sa.setBalance(1000000l);
		System.out.println(sa.getBalance());
	}
}