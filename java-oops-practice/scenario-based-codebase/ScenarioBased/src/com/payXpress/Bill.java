package payXpress;
import java.time.LocalDate;

abstract class Bill implements IPayable {

    private String type;
    private double amount;
    private LocalDate dueDate;
    private boolean isPaid;

   
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

   
    @Override
    public void pay() {
        if (isPaid) {
            System.out.println(type + " bill already paid.");
            return;
        }
        isPaid = true;
        System.out.println(type + " bill paid successfully. Amount: $" + amount);
    }

   
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    
    protected boolean isPaid() {
        return isPaid;
    }

    protected String getType() {
        return type;
    }
}