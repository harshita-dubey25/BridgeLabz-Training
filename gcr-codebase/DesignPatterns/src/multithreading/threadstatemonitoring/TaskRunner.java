package multithreading.threadstatemonitoring;

public class TaskRunner {
	   
	public void running() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}