package org.example.median_of_two_sorted_arrays;

import java.util.Arrays;

public class CombinedArraysSortSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resultArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, resultArray, 0, nums1.length);
        System.arraycopy(nums2, 0, resultArray, nums1.length, nums2.length);
        Arrays.sort(resultArray);
        if (resultArray.length % 2 == 0) {
            return (resultArray[resultArray.length / 2 - 1] + resultArray[resultArray.length / 2]) / 2.0;
        }
        return resultArray[(resultArray.length / 2)];
    }
}
