// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Counting rightward**
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int east = 0;
        int passing = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                east++;
            }
            else {
                passing += east;
                if (passing > 1000000000)
                    return -1;
            }
        }
        return passing;
    }
}

