package org.example.longest_substring_without_repeating_words;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int longestLength = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                longestLength = Math.max(longestLength, r - l + 1);
            } else {
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l += 1;
                }
                set.add(s.charAt(r));
            }
            r += 1;
        }
        return longestLength;
    }
}
