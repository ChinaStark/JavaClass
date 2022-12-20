package Leetcode;


class Solution {
    public static String longestPalindrome(String s) {
        int len =  s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0;i < len;i++){
            dp[i][i] = true;
        }
        int start = 0, maxLen = 0;
        for(int j =1;j<len;j++){
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j)){
                    if(j - i < 3) dp[i][j] = true;
                    if(dp[i+1][j-1]) dp[i][j] = true;
                    if (dp[i][j]){
                        if(j-i+1 > maxLen){
                            maxLen = j-i+1;
                            start = i;
                        }
                    }
                }
            }
        }
        return s.substring(start,maxLen+1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

}