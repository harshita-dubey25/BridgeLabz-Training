package birdSanctuary;

public class Main {
	 public static void main(String[] args) {

	        Bird[] birds = {
	            new Eagle(101, "Rocky"),
	            new Duck(102, "Daisy"),
	            new Seagull(103, "Sky"),
	            new Kiwi(104, "Kibo")
	        };

	        for (Bird bird : birds) {
	            bird.displayInfo();
	            bird.eat();

	            if (bird instanceof Flyable) {
	                ((Flyable) bird).fly();
	            }

	            if (bird instanceof Swimmable) {
	                ((Swimmable) bird).swim();
	            }

	            System.out.println("--------------------");
	        }
	 }
}