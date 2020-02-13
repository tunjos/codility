// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        
        if (A % K == 0) {
            return (B - A) / K + 1; // +1 to include A
        } else {
                return (B - (A - A % K)) / K; // No +1 to exclude (A - A % K) = Next smallest perfectly divisible number
        }
    }
}
