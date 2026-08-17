class Solution {
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0, j = 0; i < arr1.length; i++, j++) {
            if (arr1[i] != arr2[j])
                return false;
        }
        return true;

        

    }
}