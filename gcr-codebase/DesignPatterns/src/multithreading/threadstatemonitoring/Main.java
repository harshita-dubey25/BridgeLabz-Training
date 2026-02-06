package multithreading.threadstatemonitoring;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		TaskRunner task = new TaskRunner();
	
		Thread t1 = new Thread(()->{
			task.running();
		});
		t1.setName("Lucky");
		StateMonitor.getState(t1);
		t1.start();
		StateMonitor.getState(t1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		   System.out.println(e.getMessage());
		}
		StateMonitor.getState(t1);
		t1.join();
		StateMonitor.getState(t1);
	}
}