// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Neat Solution**
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum = sum + i - A[i];
        }

        return sum + A.length + A.length + 1;
    }
}
