package org.example.algo.array;

import java.util.Arrays;

public class MergeWithoutSpace {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {0, 2, 4, 6, 8};
        int n = a.length;
        int m = b.length;

        merge(a, b, n, m);
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
        int gap = nextGap(n + m);
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                int val1 = (i < n) ? a[i] : b[i - n];
                int val2 = (j < n) ? a[j] : b[j - n];

                if (val1 > val2) {
                    if (i < n && j < n) {
                        // Both in array a
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    } else if (i < n && j >= n) {
                        // a and b
                        int temp = a[i];
                        a[i] = b[j - n];
                        b[j - n] = temp;
                    } else {
                        // Both in array b
                        int temp = b[i - n];
                        b[i - n] = b[j - n];
                        b[j - n] = temp;
                    }
                }

                i++;
                j++;
            }
            gap = nextGap(gap);
        }
    }

    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }
}
