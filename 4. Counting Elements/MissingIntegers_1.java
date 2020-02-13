// you can also use imports, for example:
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        if (A[0] > 1) {
            return 1;
        }

        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (i != A.length - 1) {

                if (A[i] == A[i + 1]) {
                    continue;
                }
                if (A[i] >= 0 && A[i] + 1 < A[i + 1]) {
                    return A[i] + 1;
                }
                if ((A[i] < 0) && (A[i + 1] > 1)) {
                    return 1;
                }
            }
            if (A[i] > max) {
                max = A[i];
            }
        }

        if (max > 0) {
            return max + 1;
        } else {
            return 1;
        }
    }
}
