// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Nice Solution**
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryString = Integer.toBinaryString(N);
        char[] binaryArray = binaryString.toCharArray();

        int curGap = 0, maxGap = 0;
        boolean counting = false;

        for (int i = 1; i < binaryArray.length; i++) {
            if (binaryArray[i] != binaryArray[i - 1]) {
                counting = !counting;
                if (!counting) {
                    if (curGap > maxGap) {
                        maxGap = curGap;
                    }
                    curGap = 0;
                } else {
                    curGap++;
                }
            } else {
                if (counting) {
                    curGap++;
                }
            }
        }
        return maxGap;
    }
}
