// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Nice but longer Solution**
class Solution {
    public int solution(int A[]) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);

        int missing = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[0] != 1) {
                missing = 1;
                break;
            }
            if (i == A.length - 1) {
                missing = A[i] + 1;
                break;
            }
            if (A[i] + 1 != A[i + 1]) {
                missing = A[i] + 1;
                break;
            }
        }
        return missing;
    }
}
