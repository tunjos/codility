// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;

        for (int i = 1; i <= A.length + 1; i++) {
            sum += i;
            if (i == A.length + 1) break;
            sum -= A[i - 1];
        }
        return sum;
    }
}
