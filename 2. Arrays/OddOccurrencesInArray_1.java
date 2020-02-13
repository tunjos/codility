// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int i = 0;

        Arrays.sort(A);
        for (i = 0; i < A.length; i = i + 2) {
            if (i + 1 == A.length)
                return A[i];

            if (A[i] == A[i + 1])
                continue;
            else
                return A[i];
        }
        return A[i];
    }
}
