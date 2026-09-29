class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        
        // Go through the string in chunks of 2k
        for (int i = 0; i < n; i += 2 * k) {
            
            // Define where to start and end the reversal for the current chunk
            int left = i;
            // If the remaining characters are less than k, 'right' will stop at the end of the string.
            // Otherwise, it will reverse exactly the first k characters.
            int right = Math.min(i + k - 1, n - 1);
            
            // Reverse the characters from 'left' to 'right' using StringBuilder
            while (left < right) {
                char temp1 = sb.charAt(left);
                char temp2 = sb.charAt(right);
                sb.setCharAt(left, temp2);
                sb.setCharAt(right, temp1);
                left++;
                right--;
            }
        }
        
        return sb.toString();
    }
}