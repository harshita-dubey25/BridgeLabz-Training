package gamebox;

public class Main {
	   public static void main(String[] args) {

	        Game g1 = new ArcadeGame("Speed Rush", 299, 4.5);
	        Game g2 = new StrategyGame("Empire Builder", 4.7);

	        User user = new User("Lucky");

	        g1.playDemo();
	        g2.playDemo();

	        System.out.println("Discounted Price: " + g1.applyDiscount(20));

	        user.purchaseGame(g1);
	        user.purchaseGame(g2);

	        user.showLibrary();
	    }
}