// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//**Better Solution**
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String NBinString = Integer.toBinaryString(N);
        char NArray[] = NBinString.toCharArray();

        int cnt = 0, maxGap = 0;
        boolean counting = false;

        for (char a : NArray) {
            if (a == '0') {
                if (counting)
                    cnt++;
            }

            if (a == '1') {
                counting = true;

                if (cnt > maxGap) {
                    maxGap = cnt;
                }
                cnt = 0;
            }

        }

        return maxGap;
    }
}
