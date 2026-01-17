package gamebox;

class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    public ArcadeGame(String title, double rating) {
        super(title, "Arcade", rating);
    }

    @Override
    public void playDemo() {
        System.out.println("⚡ Arcade Demo: Fast-paced action for 2 minutes!");
    }
}