package com;

class Show {
    int time; 

    Show(int time) {
        this.time = time;
    }
}

public class CinemaHouse {

    static void bubbleSort(Show[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].time > arr[j + 1].time) {
                    Show temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void display(Show[] arr) {
        for (Show s : arr) {
            System.out.print(s.time + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Show[] shows = {
            new Show(1800),
            new Show(1030),
            new Show(1500),
            new Show(1200)
        };

        bubbleSort(shows);
        display(shows);
    }
}
