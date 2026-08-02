class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            int n = s.length();
            boolean isPalindrome = true;
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) != s.charAt(n - i - 1)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) return s;
        }
    return "";
    }
}