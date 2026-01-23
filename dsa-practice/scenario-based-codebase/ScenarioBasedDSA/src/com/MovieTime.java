package com;
import java.util.*;

class Shows {
    String movieName;
    int showTime; 

    Shows(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return movieName + " at " + showTime;
    }
}

public class MovieTime {

    public static void insertionSort(ArrayList<Shows> shows) {
        for (int i = 1; i < shows.size(); i++) {
            Shows key = shows.get(i);
            int j = i - 1;

            while (j >= 0 && shows.get(j).showTime > key.showTime) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        ArrayList<Shows> shows = new ArrayList<>();

        shows.add(new Shows("Avatar", 1000));
        shows.add(new Shows("Inception", 1300));
        shows.add(new Shows("Interstellar", 1600));

        // New show added
        shows.add(new Shows("Oppenheimer", 1200));

        insertionSort(shows);

        System.out.println("📽️ Sorted Show Timings:");
        for (Shows s : shows) {
            System.out.println(s);
        }
    }
}
