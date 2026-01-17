package budgetwise;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
	  public static void main(String[] args) {

	        Map<String, Double> limits = new HashMap<>();
	        limits.put("Food", 5000.0);
	        limits.put("Travel", 3000.0);

	        Budget budget = new MonthlyBudget(30000, 20000, limits);

	        budget.addExpense(new Transaction(6000, "EXPENSE",
	                LocalDate.now(), "Food"));
	        budget.addExpense(new Transaction(2000, "EXPENSE",
	                LocalDate.now(), "Travel"));

	        budget.generateReport();
	        budget.detectOverspend();
	    }
}