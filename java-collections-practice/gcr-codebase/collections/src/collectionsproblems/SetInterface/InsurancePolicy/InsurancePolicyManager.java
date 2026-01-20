package collectionsproblems.SetInterface.InsurancePolicy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicyManager {

    // TreeSet sorted by expiry date
    static Set<Policy> treeSet = new TreeSet<>(
            Comparator.comparing(p -> p.expiryDate)
    );

    static Set<Policy> hashSet = new HashSet<>();
    static Set<Policy> linkedHashSet = new LinkedHashSet<>();

    // Add policy to all sets
    static void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // 1️⃣ Retrieve all policies
    static void displayAll(Set<Policy> set) {
        set.forEach(System.out::println);
    }

    // 2️⃣ Policies expiring in next 30 days
    static void policiesExpiringSoon(Set<Policy> set) {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        set.stream()
           .filter(p -> !p.expiryDate.isAfter(limit))
           .forEach(System.out::println);
    }

    // 3️⃣ Policies with specific coverage type
    static void policiesByCoverage(Set<Policy> set, String type) {
        set.stream()
           .filter(p -> p.coverageType.equalsIgnoreCase(type))
           .forEach(System.out::println);
    }

    // 4️⃣ Detect duplicate policies
    static void findDuplicates(List<Policy> list) {
        Set<Integer> seen = new HashSet<>();
        list.stream()
            .filter(p -> !seen.add(p.policyNumber))
            .forEach(p -> System.out.println("Duplicate: " + p));
    }

    // 5️⃣ Performance comparison
    static void performanceTest(Set<Policy> set, Policy testPolicy) {
        long start, end;

        start = System.nanoTime();
        set.add(testPolicy);
        end = System.nanoTime();
        System.out.println("Add Time: " + (end - start));

        start = System.nanoTime();
        set.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("Search Time: " + (end - start));

        start = System.nanoTime();
        set.remove(testPolicy);
        end = System.nanoTime();
        System.out.println("Remove Time: " + (end - start));
    }

    public static void main(String[] args) {

        Policy p1 = new Policy(101, "Amit", LocalDate.now().plusDays(20), "Health", 5000);
        Policy p2 = new Policy(102, "Neha", LocalDate.now().plusDays(50), "Auto", 3000);
        Policy p3 = new Policy(103, "Ravi", LocalDate.now().plusDays(10), "Home", 7000);
        Policy p4 = new Policy(101, "Amit", LocalDate.now().plusDays(20), "Health", 5000); // duplicate

        addPolicy(p1);
        addPolicy(p2);
        addPolicy(p3);
        addPolicy(p4);

        System.out.println("\nAll Policies (HashSet):");
        displayAll(hashSet);

        System.out.println("\nPolicies Expiring Soon:");
        policiesExpiringSoon(hashSet);

        System.out.println("\nHealth Coverage Policies:");
        policiesByCoverage(hashSet, "Health");

        System.out.println("\nDuplicate Policies:");
        findDuplicates(Arrays.asList(p1, p2, p3, p4));

        System.out.println("\nPerformance Test (HashSet):");
        performanceTest(new HashSet<>(hashSet),
                new Policy(200, "Test", LocalDate.now(), "Auto", 4000));
    }
}