package org.example.algo.array;

import java.util.Arrays;

public class MergeWithoutSpace {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {0, 2, 4, 6, 8};
        int n = a.length;
        int m = b.length;

        merge(a, b, n, m);
        Arrays.sort(a);
        System.out.print("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array b: ");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
    public static void merge(int[] a, int[] b, int n, int m) {
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > b[0]) {
                // Swap a[i] and b[0]
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // Move b[0] to correct position to keep b[] sorted
                int first = b[0];
                int j = 1;
                while (j < m && b[j] < first) {
                    b[j - 1] = b[j];
                    j++;
                }
                b[j - 1] = first;
            }
        }
    }
}
