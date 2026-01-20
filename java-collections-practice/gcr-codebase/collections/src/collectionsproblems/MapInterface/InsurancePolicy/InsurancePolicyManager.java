package collectionsproblems.MapInterface.InsurancePolicy;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {

    static Map<Integer, Policy> hashMap = new HashMap<>();
    static Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();

    static TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    static void addPolicy(Policy p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);

        treeMap.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
    }

    static void getPolicyByNumber(int policyNumber) {
        Policy p = hashMap.get(policyNumber);
        System.out.println(p != null ? p : "Policy not found");
    }
    
    static void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        treeMap.subMap(today, true, limit, true)
               .values()
               .forEach(list -> list.forEach(System.out::println));
    }

    // 3️⃣ Policies for specific policyholder
    static void policiesByHolder(String holder) {
        hashMap.values().stream()
                .filter(p -> p.policyHolder.equalsIgnoreCase(holder))
                .forEach(System.out::println);
    }

    // 4️⃣ Remove expired policies
    static void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<Integer, Policy>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Policy p = it.next().getValue();
            if (p.expiryDate.isBefore(today)) {
                it.remove();
                linkedHashMap.remove(p.policyNumber);
                treeMap.get(p.expiryDate).remove(p);
            }
        }
    }

    public static void main(String[] args) {

        addPolicy(new Policy(101, "Amit", LocalDate.now().plusDays(10), "Health", 5000));
        addPolicy(new Policy(102, "Neha", LocalDate.now().plusDays(40), "Auto", 3000));
        addPolicy(new Policy(103, "Amit", LocalDate.now().minusDays(2), "Home", 7000));
        addPolicy(new Policy(104, "Ravi", LocalDate.now().plusDays(25), "Health", 6000));

        System.out.println("Policy 101:");
        getPolicyByNumber(101);

        System.out.println("\nPolicies expiring in next 30 days:");
        policiesExpiringSoon();

        System.out.println("\nPolicies for Amit:");
        policiesByHolder("Amit");

        System.out.println("\nRemoving expired policies...");
        removeExpiredPolicies();

        System.out.println("\nRemaining Policies (Insertion Order):");
        linkedHashMap.values().forEach(System.out::println);
    }
}
