package org.example.rotate_k_elements;

import java.util.HashMap;
import java.util.Map;

public class RotateKElements {
    public int[] getRotatedIntArray(int[] arr, int k) {

        int[] rotated = new int[arr.length];
        if (k > arr.length) {
            k = arr.length % k;
        }
        int j = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if ( i - k < 0) {
                j = arr.length - Math.abs(i - k);
            } else {
                j = i - k;
            }
            rotated[j] = arr[i];
        }
        return rotated;

    }
}
