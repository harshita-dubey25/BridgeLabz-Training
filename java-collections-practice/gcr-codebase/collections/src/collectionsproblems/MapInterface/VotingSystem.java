package collectionsproblems.MapInterface;

import java.util.*;

public class VotingSystem {

    private static Map<String, Integer> voteCount = new HashMap<>();

    private static Map<String, Integer> voteOrder = new LinkedHashMap<>();

    public static void castVote(String candidate) {

        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    public static void displayVoteOrder() {
        System.out.println("Votes in order of casting:");
        voteOrder.forEach((k, v) ->
                System.out.println(k + " → " + v));
    }

    // Display results in sorted order
    public static void displaySortedResults() {
        System.out.println("Final Results (Sorted):");
        Map<String, Integer> sorted = new TreeMap<>(voteCount);
        sorted.forEach((k, v) ->
                System.out.println(k + " → " + v));
    }

    public static void main(String[] args) {

        castVote("Alice");
        castVote("Bob");
        castVote("Alice");
        castVote("Charlie");
        castVote("Bob");
        castVote("Alice");

        displayVoteOrder();
        System.out.println();
        displaySortedResults();
    }
}
