package org.example.algo.search;

public class KMPAlgorithm {

    /***
     *
     * * KMP Algorithm
     * * 1. Preprocess the pattern to create a longest prefix-suffix (LPS) array.
     * * 2. Use the LPS array to skip unnecessary comparisons in the text.
     * * 3. Iterate through the text and pattern, using the LPS array to skip unnecessary comparisons.
     * * 4. If a match is found, return the index of the match.
     *
     */
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        KMPSearch(pattern, text);
    }
    public static void KMPSearch(String pattern, String text) {
        int M = pattern.length();
        int N = text.length();

        // create lps[] that will hold the longest prefix suffix
        // values for pattern
        int lps[] = new int[M];
        computeLPSArray(pattern, M, lps);

        int i = 0; // index for text[]
        int j = 0; // index for pattern[]
        while (N - i >= M - j) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];
            } else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
    }

    private static void computeLPSArray(String pattern, int m, int[] lps) {
        int len = 0; // length of the previous longest prefix suffix
        lps[0] = 0; // lps[0] is always 0
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

}
