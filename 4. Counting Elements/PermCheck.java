// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        if (A[0] != 1)
            return 0;

        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i] + 1) != A[i + 1])
                return 0;
        }
        return 1;
    }
}
