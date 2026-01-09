package bookbazar;

class Book implements IDiscountable {
    protected String title;
    protected String author;
    protected double price;
    private int stock;   
    
    Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public void updateStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    public int getStock() {
        return stock;
    }

    public double applyDiscount(double totalPrice) {
        return totalPrice;
    }
}

