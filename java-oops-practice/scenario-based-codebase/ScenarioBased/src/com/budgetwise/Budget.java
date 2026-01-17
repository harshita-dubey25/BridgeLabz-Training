package budgetwise;
import java.util.*;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    private List<Transaction> expenses;   
    
    protected Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.expenses = new ArrayList<>();
    }

   
    public void addExpense(Transaction t) {
        if (t.getType().equalsIgnoreCase("EXPENSE")) {
            expenses.add(t);
        }
    }

    protected double getTotalExpenses() {
        return expenses.stream().mapToDouble(Transaction::getAmount).sum();
    }

    
    public double calculateNetSavings() {
        return income - getTotalExpenses();
    }

    protected Map<String, Double> categoryExpenseMap() {
        Map<String, Double> map = new HashMap<>();
        for (Transaction t : expenses) {
            map.put(t.getCategory(),
                    map.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
        }
        return map;
    }
}
