// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Counting leftward**
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0, ones = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                ones++;
            } else {
                count += ones;
                if (count > 1000000000) {
                    return -1;
                }
            }
        }
        return count;
    }
}
