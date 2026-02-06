package multithreading.jobSehduling;

public class PrintJob implements Runnable {

	@Override
	public void run() {
		printDetails();
	}
    public void printDetails() {
    	System.out.println("["+Thread.currentThread().getName()+"] "+Thread.currentThread().getThreadGroup()+" Pages, Priority "+Thread.currentThread().getPriority());
    }
}