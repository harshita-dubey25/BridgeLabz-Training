package multithreading.restaurant;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Chef chef1 = new Chef("Lucky","Pizza",3000);
		Chef chef2 = new Chef("Nageshwar","Burger",5000);
		Thread t1 = new Thread(()->{
			try {
				chef1.perparingFood();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(()->{
			try {
				chef2.perparingFood();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("The Resturant is Closed Now");
	}
}