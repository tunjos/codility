// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Slow Solution**
public class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] C = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                C[A[i] - 1]++;

                if (C[A[i] - 1] > max) {
                    max = C[A[i] - 1];
                }

            } else {
                for (int j = 0; j < C.length; j++) {
                    if (C[j] < max)
                        C[j] = max;
                }
            }
        }

        return C;
    }
}
