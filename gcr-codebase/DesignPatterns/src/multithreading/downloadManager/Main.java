package multithreading.downloadManager;

public class Main {
	public static void main(String[] args) {
		Downloader download = new Downloader();
		Thread t1 = new Thread(()->{
			try {
				download.download("Document.pdf",15);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		});
		
		Thread t2 = new Thread(()->{
			try {
				download.download("Image.png",45);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		});
		
		t1.start();
		t2.start();
	}
}
