// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int cmax = 0, max = 0;
        boolean seen1 = false;

        while (N > 0) {
            if (N % 2 == 1) {
                if (seen1) {
                    if (cmax > max) {
                        max = cmax;
                    }
                    cmax = 0;
                }
                seen1 = true;
            } else {
                if (seen1) {
                    cmax++;
                }
            }
            N = N / 2;
        }
        return max;
    }
}
