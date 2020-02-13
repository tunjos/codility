// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A[]) {
        // write your code in Java SE 8
        int minDiff = Integer.MAX_VALUE;
        int currDiff = 0;
        int rSum = 0;
        int lSum = 0;

        for (int i = 0; i < A.length; i++) {
            rSum += A[i];
        }

        for (int i = 0; i < A.length - 1; i++) {
            lSum += A[i];
            rSum -= A[i];

            currDiff = Math.abs(lSum - rSum);
            if (currDiff < minDiff) {
                minDiff = currDiff;
            }
        }
        return minDiff;
    }
}
