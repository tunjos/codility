// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        // [][4] to store weights(1) of each nucleotide A, C, G and T
        int[][] DNASPrefixSums = new int[S.length() + 1][4];
        int[] result = new int[P.length];

        DNASPrefixSums[0][0] = 0;
        DNASPrefixSums[0][1] = 0;
        DNASPrefixSums[0][2] = 0;
        DNASPrefixSums[0][3] = 0;

        for (int i = 1; i < S.length() + 1; i++) {
            if (S.charAt(i - 1) == 'A') {
                DNASPrefixSums[i][0] = DNASPrefixSums[i - 1][0] + 1;
                DNASPrefixSums[i][1] = DNASPrefixSums[i - 1][1];
                DNASPrefixSums[i][2] = DNASPrefixSums[i - 1][2];
                DNASPrefixSums[i][3] = DNASPrefixSums[i - 1][3];
            } else if (S.charAt(i - 1) == 'C') {
                DNASPrefixSums[i][0] = DNASPrefixSums[i - 1][0];
                DNASPrefixSums[i][1] = DNASPrefixSums[i - 1][1] + 1;
                DNASPrefixSums[i][2] = DNASPrefixSums[i - 1][2];
                DNASPrefixSums[i][3] = DNASPrefixSums[i - 1][3];
            } else if (S.charAt(i - 1) == 'G') {
                DNASPrefixSums[i][0] = DNASPrefixSums[i - 1][0];
                DNASPrefixSums[i][1] = DNASPrefixSums[i - 1][1];
                DNASPrefixSums[i][2] = DNASPrefixSums[i - 1][2] + 1;
                DNASPrefixSums[i][3] = DNASPrefixSums[i - 1][3];
            } else if (S.charAt(i - 1) == 'T') {
                DNASPrefixSums[i][0] = DNASPrefixSums[i - 1][0];
                DNASPrefixSums[i][1] = DNASPrefixSums[i - 1][1];
                DNASPrefixSums[i][2] = DNASPrefixSums[i - 1][2];
                DNASPrefixSums[i][3] = DNASPrefixSums[i - 1][3] + 1;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (DNASPrefixSums[Q[i] + 1][0] - DNASPrefixSums[P[i]][0] > 0) {
                result[i] = 1;
            } else if (DNASPrefixSums[Q[i] + 1][1] - DNASPrefixSums[P[i]][1] > 0) {
                result[i] = 2;
            } else if (DNASPrefixSums[Q[i] + 1][2] - DNASPrefixSums[P[i]][2] > 0) {
                result[i] = 3;
            } else if (DNASPrefixSums[Q[i] + 1][3] - DNASPrefixSums[P[i]][3] > 0) {
                result[i] = 4;
            }
        }

        return result;
    }
}

