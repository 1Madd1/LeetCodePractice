package org.example;

import org.example.longest_palindromic_substring.LongestPalindromicSubstring;
import org.example.longest_substring_without_repeating_words.Solution;
import org.example.median_of_two_sorted_arrays.CombinedArraysSortSolution;
import org.example.zigzag_conversion.ZigzagConversion;

public class Main {

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        String str = "abcdfaavdref";
//        System.out.println(solution.lengthOfLongestSubstring(str));
//        CombinedArraysSortSolution cass = new CombinedArraysSortSolution();
//        int[] nums1 = {1,2,5,6,9};
//        int[] nums2 = {3,8};
//        System.out.println(cass.findMedianSortedArrays(nums1, nums2));
//        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
//        System.out.println(lps.longestPalindrome("abbcccbbbcaaccbababcbcabca"));
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        System.out.println(zigzagConversion.convert("PAYPALISHIRING", 3));
    }
}