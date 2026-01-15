package com;
import java.util.*;

public class CallCenter {

    
    private Queue<String> normalQueue = new LinkedList<>();

    
    private PriorityQueue<String> vipQueue =
            new PriorityQueue<>(); 

    
    private HashMap<String, Integer> callCountMap = new HashMap<>();

    
    public void addCall(String customerName, boolean isVIP) {
        
        if (isVIP) {
            vipQueue.offer(customerName);
            System.out.println(customerName + " added to VIP Queue");
        } else {
            normalQueue.offer(customerName);
            System.out.println(customerName + " added to Normal Queue");
        }

       
        callCountMap.put(customerName,
                callCountMap.getOrDefault(customerName, 0) + 1);
    }

    
    public void serveCustomer() {
        if (!vipQueue.isEmpty()) {
            System.out.println("Serving VIP customer: " + vipQueue.poll());
        } else if (!normalQueue.isEmpty()) {
            System.out.println("Serving Normal customer: " + normalQueue.poll());
        } else {
            System.out.println("No customers in queue");
        }
    }

    
    public void displayCallCounts() {
        System.out.println("\nCustomer Call Count This Month:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " calls");
        }
    }

    
    public void displayQueues() {
        System.out.println("\nVIP Queue: " + vipQueue);
        System.out.println("Normal Queue: " + normalQueue);
    }

    public static void main(String[] args) {
        CallCenter center = new CallCenter();

        center.addCall("Amit", false);
        center.addCall("Riya", true);
        center.addCall("Neha", false);
        center.addCall("Karan", true);
        center.addCall("Riya", true);

        center.displayQueues();

        center.serveCustomer();
        center.serveCustomer();

        center.displayQueues();
        center.displayCallCounts();
    }
}
