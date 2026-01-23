package com;

class Medicine {
    String name;
    int expiryDays; 

    Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return name + " → Expires in " + expiryDays + " days";
    }
}

public class MedwareHouse {

    public static void mergeSort(Medicine[] meds, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(meds, left, mid);
            mergeSort(meds, mid + 1, right);

            merge(meds, left, mid, right);
        }
    }

    private static void merge(Medicine[] meds, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = meds[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = meds[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].expiryDays <= R[j].expiryDays) {
                meds[k++] = L[i++];
            } else {
                meds[k++] = R[j++];
            }
        }

        while (i < n1) meds[k++] = L[i++];
        while (j < n2) meds[k++] = R[j++];
    }

    public static void main(String[] args) {

        Medicine[] medicines = {
            new Medicine("Paracetamol", 120),
            new Medicine("Insulin", 30),
            new Medicine("Antibiotic", 60),
            new Medicine("Vitamin C", 200)
        };

        mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("💊 Medicines Sorted by Expiry Date:");
        for (Medicine m : medicines) {
            System.out.println(m);
        }
    }
}
