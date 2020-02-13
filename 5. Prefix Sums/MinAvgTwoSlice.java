// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Theory: The min average has to be in at least 2 or 3 elements**
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int index = 0;
        float minAvg = Float.MAX_VALUE, avg2 = 0, avg3 = 0;

        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1) {
                break;
            }
            avg2 = (A[i] + A[i + 1]) / 2.0f;
            if (avg2 < minAvg) {
                minAvg = avg2;
                index = i;
            }

            if (i == A.length - 2) {
                continue;
            }
            avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0f;
            if (avg3 < minAvg) {
                minAvg = avg3;
                index = i;
            }
        }
        return index;
    }
}
