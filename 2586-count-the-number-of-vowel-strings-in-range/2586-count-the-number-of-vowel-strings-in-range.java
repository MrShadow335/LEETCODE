class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left; i<=right; i++){
            String s = words[i];
            if((isVowel(s.charAt(0))== true && isVowel(s.charAt(s.length() - 1)))==true) count++;
        }
        return count;
    }
    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}