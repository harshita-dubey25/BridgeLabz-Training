package com;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " : " + score;
    }
}

public class GamerZone {

    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pi = partition(players, low, high);
            quickSort(players, low, pi - 1);
            quickSort(players, pi + 1, high);
        }
    }

    private static int partition(Player[] players, int low, int high) {
        int pivot = players[high].score;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players[j].score > pivot) { 
                i++;
                Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }

        Player temp = players[i + 1];
        players[i + 1] = players[high];
        players[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Alex", 450),
            new Player("Riya", 980),
            new Player("Sam", 620),
            new Player("Neha", 780)
        };

        quickSort(players, 0, players.length - 1);

        System.out.println("🏆 Leaderboard:");
        for (Player p : players) {
            System.out.println(p);
        }
    }
}


