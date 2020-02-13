// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        Set<Integer> river = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            river.add(A[i]);
             
            if (river.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
