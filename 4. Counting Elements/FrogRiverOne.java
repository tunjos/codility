// you can also use imports, for example:
// import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int steps = X;
        boolean[] bitmap = new boolean[steps + 1];
        for (int i = 0; i < A.length; i++) {
            if (!bitmap[A[i]]) {
                bitmap[A[i]] = true;
                steps--;
            }
            if (steps == 0)
                return i;
        }
        return -1;
    }
}
