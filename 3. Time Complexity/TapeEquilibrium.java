// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int lsum = 0, rsum = 0, tmin = 0, min = 0;
        for (int i : A) {
            rsum += i;
        }

        min = rsum - 2 * A[0]; // min = (rsum - A[0]) - (A[0]), (rsum - 2 * A[0]) == 1st min
        if (min < 0)
            min *= -1;

        for (int i = 0; i < A.length - 1; i++) {
            lsum += A[i];
            rsum -= A[i];

            tmin = rsum - lsum;

            if (tmin < 0)
                tmin *= -1;

            if (tmin < min)
                min = tmin;
        }
        return min;
    }
}
