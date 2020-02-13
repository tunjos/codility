// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int tMax = 0, lastMaxOp = 0;
        int C[] = new int[N];

        for (int i = 0; i < A.length; ++i) {
            if (A[i] <= N) {
                int pos = A[i] - 1;
                if (C[pos] <= lastMaxOp) { // or C[pos] < lastMaxOp
                    C[pos] = lastMaxOp + 1;
                } else {
                    C[pos]++;
                }

                if (C[pos] > tMax) {
                    tMax = C[pos];
                }
            } else if (A[i] == N + 1) {
                lastMaxOp = tMax;
            }
        }

        for (int i = 0; i < N; ++i) {
            if (C[i] < lastMaxOp) {
                C[i] = lastMaxOp;
            }
        }
        return C;
    }
}
