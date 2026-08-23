class Solution {
    public boolean isPalindrome(String str){
    str = str.toLowerCase();
    // str = str.replaceAll("[0-9]", "");
    str = str.replaceAll("\\s", "");
    str = str.replaceAll("[^a-z0-9]", "");
    System.out.println(str);
    int i=0, j=str.length()-1;
    while(i<j){
        char s1 = str.charAt(i);
        char s2 = str.charAt(j);
        if(s1 != s2){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }

}