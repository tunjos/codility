public class Solution {

    public static void main(String[] args) {
        int[] A = new int[]{2, 3, 7, 5, 1, 3, 9};
        int k = 4, m = 6;
        System.out.println(mushrooms(A, k, m));
    }

    public static int mushrooms(int[] A, int k, int m) {
        int n = A.length;
        int[] pref = prefixSums(A);
        int result = 0;

        for (int p = 0; p < Math.min(m, k) + 1; p++) {
            int leftPos = k - p;
            int rightPos = Math.min(n - 1, Math.max(k, k + m - 2 * p));
            result = Math.max(result, countTotal(pref, leftPos, rightPos));
        }
        for (int p = 0; p < Math.min(m + 1, n - k); p++) {
            int rightPos = k + p;
            int leftPos = Math.max(0, Math.min(k, k - (m - 2 * p)));
            result = Math.max(result, countTotal(pref, leftPos, rightPos));
        }
        return result;
    }

    public static int[] prefixSums(int[] A) {
        int n = A.length;
        int[] P = new int[n + 1];
        P[0] = 0;

        for (int k = 1; k < n + 1; k++) {
            P[k] = P[k - 1] + A[k - 1];
        }
        return P;
    }

    public static int countTotal(int[] P, int x, int y) {
        return P[y + 1] - P[x];
    }
}

