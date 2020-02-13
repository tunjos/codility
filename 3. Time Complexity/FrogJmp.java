class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        double reqD = Y - X;
            return (int) Math.ceil(reqD / D); //round up, since jumps must be whole :)
    }
}
