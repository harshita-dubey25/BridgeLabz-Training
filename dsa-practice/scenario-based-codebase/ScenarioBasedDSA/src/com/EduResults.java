package com;
import java.util.*;

class Students {
    String name;
    int score;

    Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " - " + score;
    }
}

public class EduResults {
	
    public static List<Students> merge(List<Students> a, List<Students> b) {
        List<Students> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i).score >= b.get(j).score) { 
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }

    public static void main(String[] args) {

        List<Students> district1 = Arrays.asList(
                new Students("Amit", 95),
                new Students("Neha", 90)
        );

        List<Students> district2 = Arrays.asList(
                new Students("Ravi", 96),
                new Students("Kiran", 90)
        );

        List<Students> stateRank = merge(district1, district2);

        System.out.println("State Rank List:");
        stateRank.forEach(System.out::println);
    }
}
