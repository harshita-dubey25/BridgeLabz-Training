package collectionsproblems.MapInterface;

import java.util.*;

class WithdrawalRequest {
 int accountNumber;
 double amount;

 WithdrawalRequest(int accountNumber, double amount) {
     this.accountNumber = accountNumber;
     this.amount = amount;
 }
}

public class BankingSystem {

 private static Map<Integer, Double> accounts = new HashMap<>();

 private static TreeMap<Double, List<Integer>> balanceSorted = new TreeMap<>();

 private static Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

 public static void addAccount(int accNo, double balance) {
     accounts.put(accNo, balance);
     balanceSorted.computeIfAbsent(balance, k -> new ArrayList<>()).add(accNo);
 }

 public static void requestWithdrawal(int accNo, double amount) {
     withdrawalQueue.offer(new WithdrawalRequest(accNo, amount));
 }

 public static void processWithdrawals() {

     while (!withdrawalQueue.isEmpty()) {
         WithdrawalRequest req = withdrawalQueue.poll();

         double currentBalance = accounts.getOrDefault(req.accountNumber, -1.0);

         if (currentBalance == -1) {
             System.out.println("Invalid Account: " + req.accountNumber);
             continue;
         }

         if (currentBalance >= req.amount) {

             // Update TreeMap
             balanceSorted.get(currentBalance).remove(req.accountNumber);
             if (balanceSorted.get(currentBalance).isEmpty())
                 balanceSorted.remove(currentBalance);

             double newBalance = currentBalance - req.amount;

             accounts.put(req.accountNumber, newBalance);
             balanceSorted.computeIfAbsent(newBalance, k -> new ArrayList<>())
                          .add(req.accountNumber);

             System.out.println("Withdrawal successful → Acc "
                     + req.accountNumber + " New Balance: ₹" + newBalance);

         } else {
             System.out.println("Insufficient funds → Acc "
                     + req.accountNumber);
         }
     }
 }

 public static void displaySortedByBalance() {
     System.out.println("Customers Sorted by Balance:");
     balanceSorted.forEach((balance, accList) -> {
         for (int acc : accList) {
             System.out.println("Account: " + acc + " Balance: ₹" + balance);
         }
     });
 }

 public static void main(String[] args) {

     addAccount(101, 5000);
     addAccount(102, 12000);
     addAccount(103, 8000);

     requestWithdrawal(101, 2000);
     requestWithdrawal(103, 9000);
     requestWithdrawal(102, 3000);

     processWithdrawals();
     System.out.println();
     displaySortedByBalance();
 }
}
