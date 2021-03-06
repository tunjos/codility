// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Better Solution**
class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length == 0 || A.length == 1) {
            return A;
        }

        K = K % A.length;
        int temp = 0, prev = 0, i = 0, j = 0, k = 0;
        for (i = 0; i < K; i++) {
            for (j = 0; j < A.length; j++) {
                k = j + 1;

                if (k == A.length)
                    k = 0;

                if (j == 0) {
                    prev = A[j];
                }

                temp = A[k];
                A[k] = prev;
                prev = temp;
            }
        }
        return A;

    }
}
