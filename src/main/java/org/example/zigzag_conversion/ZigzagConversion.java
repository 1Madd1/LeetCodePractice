package org.example.zigzag_conversion;

import java.util.*;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
//        String[][] stringMatrix = new String[numRows][s.length() / 2 + 1];
//        Queue<Character> queue = new LinkedList<>();
//        for (char c : s.toCharArray()) {
//            queue.offer(c);
//        }
//        if (numRows == 1) {
//            return s;
//        }
//        boolean reverse = false;
//        int j = 0;
//        for (int i = 0; i < numRows;) {
//            if (i == 0) {
//                reverse = false;
//            } else if (i == numRows - 1) {
//                reverse = true;
//            }
//            if (queue.peek() != null) {
//                stringMatrix[i][j] = queue.poll().toString();
//            } else {
//                break;
//            }
//            if (reverse) {
//                i--;
//                j++;
//            } else {
//                i++;
//            }
//        }
//        String result = "";
//        for (int i = 0; i < stringMatrix.length; i++) {
//            for (j = 0; j < stringMatrix[i].length; j++) {
//                if (stringMatrix[i][j] != null) {
//                    result += stringMatrix[i][j];
//                }
//            }
//        }
//        return result;
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }
        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
