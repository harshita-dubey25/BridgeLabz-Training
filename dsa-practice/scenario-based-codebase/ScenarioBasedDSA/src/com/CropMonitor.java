package com;

class SensorData {
    long timestamp;
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}

public class CropMonitor {

    static int partition(SensorData[] arr, int low, int high) {
        long pivot = arr[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].timestamp <= pivot) {
                i++;
                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        SensorData temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(SensorData[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void display(SensorData[] arr) {
        for (SensorData s : arr) {
            System.out.println(s.timestamp + " → " + s.temperature);
        }
    }

    public static void main(String[] args) {
    	SensorData[] data = {
            new SensorData(1700003000L, 28.5),
            new SensorData(1700001000L, 26.2),
            new SensorData(1700002000L, 27.8)
        };

        quickSort(data, 0, data.length - 1);
        display(data);
    }
}
