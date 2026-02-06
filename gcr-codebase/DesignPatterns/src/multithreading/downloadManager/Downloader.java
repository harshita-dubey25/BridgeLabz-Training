package multithreading.downloadManager;

public class Downloader {
	public void download(String s,double size) throws InterruptedException {
   	 int rem = 0;
   	 if(s.contains("pdf")) {
   		 rem = 200;
   	 }else if(s.contains("png")) {
   		 rem = 600;
   	 }else {
   		 rem = 1000;
   	 }
   	 
   	 long chunks = (long)size%4;
   	 double progress = 0;
   	 System.out.println(s+" started downloading :: ");
   	 while(progress<100) {
   		 System.out.println("The file "+s+" is downloaded "+progress+"%");
   		 progress +=25;
   		 Thread.sleep((chunks*1000)+rem);
   	 }
   	 System.out.println("Downloading complete 100% "+s);
    }
}
