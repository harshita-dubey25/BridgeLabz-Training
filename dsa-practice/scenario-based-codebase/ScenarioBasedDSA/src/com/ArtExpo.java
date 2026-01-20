package com;

class Artist {
    String name;
    int registrationTime; 

    Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return name + " (Time: " + registrationTime + ")";
    }
}
public class ArtExpo {

    static void insertionSort(Artist[] artists) {
        for (int i = 1; i < artists.length; i++) {
            Artist key = artists[i];
            int j = i - 1;

            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }
            artists[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Artist[] artists = {
            new Artist("Alice", 105),
            new Artist("Bob", 101),
            new Artist("Carol", 110),
            new Artist("David", 103)
        };

        insertionSort(artists);

        for (Artist a : artists) {
            System.out.println(a);
        }
    }
}
