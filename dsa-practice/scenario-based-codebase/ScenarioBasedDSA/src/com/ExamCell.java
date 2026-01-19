package com;

class Student {
    int rollNo;
    int score;

    Student(int rollNo, int score) {
        this.rollNo = rollNo;
        this.score = score;
    }
}

public class ExamCell {

    static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(Student[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Sort by score (Descending for rank list)
        while (i < n1 && j < n2) {
            if (L[i].score >= R[j].score) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void displayRanks(Student[] arr) {
        int rank = 1;
        for (Student s : arr) {
            System.out.println(
                "Rank " + rank++ +
                " | Roll No: " + s.rollNo +
                " | Score: " + s.score
            );
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(101, 450),
            new Student(205, 480),
            new Student(309, 430),
            new Student(412, 500),
            new Student(118, 480)
        };

        mergeSort(students, 0, students.length - 1);
        displayRanks(students);
    }
}


