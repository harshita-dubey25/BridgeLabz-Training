package multithreading.restaurant;

public class Chef {
    private String chefName;
    private String dishName;
    private long time;
    
	 public Chef(String chefName, String dishName, long time) {
		this.chefName = chefName;
		this.dishName = dishName;
		this.time = time;
	 }

	 public String getChefName() {
		 return chefName;
	 }

	 public void setChefName(String chefName) {
		 this.chefName = chefName;
	 }

	 public String getDishName() {
		 return dishName;
	 }

	 public void setDishName(String dishName) {
		 this.dishName = dishName;
	 }

	 public long getTime() {
		 return time;
	 }

	 public void setTime(long time) {
		 this.time = time;
	 }
   
	 public void perparingFood() throws InterruptedException{
		 System.out.println("Stated Preparing "+dishName);
		 long rem = time/4;
		 int processed = 0;
		 while(processed<=100) {
			 System.out.println("["+chefName+"] Preparing "+dishName+" "+processed+"%");
			 processed+=25;
			 Thread.sleep(rem);
		 }
		 System.out.println("["+chefName+"] is ready with "+dishName);
	 }
    
}