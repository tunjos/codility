// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Neat Solution**
class Solution {
    public int[] solution(int[] A, int K) {
        int len = A.length;
        if (len == 0 || len == 1) {
            return A;
        }

        int rot = K % len;
        if (rot == 0) {
            return A;
        }

        for (int i = 0; i < K; i++) {
            int last = A[len - 1];
            for (int j = len - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = last;
        }

        return A;
    }
}
