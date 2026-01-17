package gamebox;

abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

   
    protected Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    
    protected Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

   
    public double applyDiscount(double percent) {
        return price - (price * percent / 100);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }
}