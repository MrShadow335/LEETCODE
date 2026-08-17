class Solution {
    public boolean judgeSquareSum(int n) {
        int i = 0;
        int j = (int)Math.sqrt(n);

        while (i <= j) {
            long sq = (long)i * i + (long)j * j;

            if (sq == n) {
                return true;
            } else if (sq > n) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}