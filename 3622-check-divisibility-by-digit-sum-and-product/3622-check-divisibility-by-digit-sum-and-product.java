class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum =0;
        int prod = 1;
        while(n != 0){
            int y = n%10;
            sum += y;
            prod *= y;
            n /= 10;
        }
        if( x % (sum + prod) ==0 ) return true;
        return false;
    }
}