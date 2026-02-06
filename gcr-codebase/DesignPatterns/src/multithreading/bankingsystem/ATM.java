package multithreading.bankingsystem;

public class ATM {
	public static void main(String[] args) {
		Bank b1 = new Bank(15000,"Lucky");
		Thread t1 = new Thread(()->{
			b1.withdrawal(14044);
			b1.credidate(1500);
		});
	
		t1.start();
	}
}