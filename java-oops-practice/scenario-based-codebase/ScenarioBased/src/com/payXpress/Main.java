package payXpress;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

        Bill bill1 = new ElectricityBill(1200, LocalDate.now().plusDays(5));
        Bill bill2 = new WaterBill(500, LocalDate.now().plusDays(3));
        Bill bill3 = new InternetBill(999, LocalDate.now().plusDays(2));

       
        bill1.sendReminder();
        bill2.sendReminder();
        bill3.sendReminder();

       
        bill1.pay();
        bill3.pay();

        
        double lateAmount = bill2.calculateLateFee(50);
        System.out.println("Water Bill with Late Fee: $" + lateAmount);
    }
}