class Solution {
    public int strStr(String s1, String s2) {

        // If s2 is bigger, it cannot be inside s1
        if (s2.length() > s1.length()) {
            return -1;
        }

        // i = possible starting position in s1
        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            // j = position in s2
            int j = 0;

            // Compare s1 and s2 character by character
            while (j < s2.length() &&
                   s1.charAt(i + j) == s2.charAt(j)) {

                j++;
            }

            // If all characters of s2 matched
            if (j == s2.length()) {
                return i;
            }
        }

        // s2 was not found
        return -1;
    }
}