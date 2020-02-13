// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        String NBinString = Integer.toBinaryString(N);
        char NArray[] = NBinString.toCharArray();

        int cnt = 0, maxGap = 0;
        boolean counting = false;

        for (int i = 0; i < NArray.length; i++) {
            if (NArray[i] == '0') {
                if (!counting) {
                    counting = true;
                }
                cnt++;
            }
            if (NArray[i] == '1') {
                counting = false;
                if (cnt > maxGap) {
                    maxGap = cnt;
                }
                cnt = 0;
            }
        }
        return maxGap;
    }
}
