package bookbazar;

class PrintedBook extends Book {

    PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9;
    }
}
