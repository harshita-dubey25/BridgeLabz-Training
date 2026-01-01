package com.polymorphismandencapsulation.ECommercePlatform;

class BillingService {

    public static void calculateFinalPrice(Product[] products) {

        for (Product p : products) {
            p.getProductDetails();

            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            }

            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println();
        }
    }
}
