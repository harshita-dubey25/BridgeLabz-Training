package com;

class User {
    String name;
    int steps;

    User(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return name + " - " + steps + " steps";
    }
}

public class FitnessTracker {

    public static void bubbleSort(User[] users) {
        int n = users.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (users[j].steps < users[j + 1].steps) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        User[] users = {
                new User("Amit", 9000),
                new User("Neha", 12000),
                new User("Ravi", 7000),
                new User("Kiran", 10000)
        };

        bubbleSort(users);

        System.out.println("Daily Step Ranking:");
        for (User u : users) {
            System.out.println(u);
        }
    }
}
