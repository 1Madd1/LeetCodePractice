package org.example.longest_palindromic_substring;


public class LongestPalindromicSubstring {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }

    public String longestPalindrome(String s) {
        String leftSubstring = "";
        String rightSubstring = "";
        if (this.isPalindrome(s)) {
            return s;
        } else if (s.length() == 2) {
            return s.charAt(0) + "";
        } else {
            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = s.length() - 2; j >= i; j--) {
                    if (s.charAt(i) == s.charAt(j)) {

                    }
                }
            }

            return leftSubstring.length() > rightSubstring.length() ? leftSubstring : rightSubstring;
        }

    }
}
