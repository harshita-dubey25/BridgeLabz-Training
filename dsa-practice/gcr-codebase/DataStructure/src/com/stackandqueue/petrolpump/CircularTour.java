package com.stackandqueue.petrolpump;

public class CircularTour {

    public static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;

        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }
    
}

