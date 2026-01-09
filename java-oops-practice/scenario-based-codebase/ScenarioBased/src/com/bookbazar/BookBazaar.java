package bookbazar;

public class BookBazaar {
    public static void main(String[] args) {

        Book ebook = new EBook("Java Basics", "James Gosling", 500, 10);
        Book printed = new PrintedBook("OOP Concepts", "Bjarne", 800, 5);

        int qty1 = 2;
        int qty2 = 1;

        double total1 = ebook.price * qty1;
        double total2 = printed.price * qty2;

        total1 = ebook.applyDiscount(total1);
        total2 = printed.applyDiscount(total2);

        double finalAmount = total1 + total2;

        ebook.updateStock(qty1);
        printed.updateStock(qty2);

        Order order = new Order("Harshita");
        order.showStatus();

        System.out.println("Final Amount to Pay: ₹" + finalAmount);
    }
}
