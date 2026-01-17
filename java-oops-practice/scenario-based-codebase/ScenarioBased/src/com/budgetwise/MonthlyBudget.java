package budgetwise;

import java.util.Map;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit,
                         Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📅 Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("⚠ Monthly Overspending Check");
        categoryExpenseMap().forEach((cat, spent) -> {
            if (spent > categoryLimits.getOrDefault(cat, Double.MAX_VALUE)) {
                System.out.println(cat + " exceeded monthly limit");
            }
        });
    }
}