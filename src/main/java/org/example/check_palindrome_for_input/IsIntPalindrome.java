package org.example.check_palindrome_for_input;

public class IsIntPalindrome {
    public boolean isPalindrome(int x) {
        String num = x + "";
        StringBuilder sb = new StringBuilder(num);
        if (sb.reverse().toString().equals(num)) {
            return true;
        }
        return false;
    }

//    public boolean isPalindrome(int x) {
//        String s = String.valueOf(x); // Convert to String
//        int n = s.length(); // Store the String length to int n
//
//        for (int i=0; i<n/2; i++) {
//            // We check whether the elements at the same distance from
//            // beginning and from ending are same, if not we return false
//            if (s.charAt(i) != s.charAt(n-i-1)) return false;
//        }
//
//        // if no flaws are found we return true
//        return true;
//    }

//    public boolean isPalindrome(int x) {
//        if (x<0 || (x!=0 && x%10==0)) return false;
//        int rev = 0;
//        while (x>rev){
//            rev = rev*10 + x%10;
//            x = x/10;
//        }
//        return (x==rev || x==rev/10);
//    }


}
