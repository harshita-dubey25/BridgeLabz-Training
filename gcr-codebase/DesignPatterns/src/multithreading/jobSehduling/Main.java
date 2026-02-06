package multithreading.jobSehduling;

public class Main {
	public static void main(String[] args) {
		PrintJob printjob = new PrintJob();
		Thread t1 = new Thread(printjob);
		Thread t2 = new Thread(printjob);
		Thread t3 = new Thread(printjob);
		Thread t4 = new Thread(printjob);
		Thread t5 = new Thread(printjob);
		t1.setName("Job1");
		t2.setName("Job2");
		t3.setName("Job3");
		t4.setName("Job4");
		t5.setName("Job5");
		
		t1.setPriority(1);
		t2.setPriority(3);
		t3.setPriority(5);
		t4.setPriority(7);
		t5.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
