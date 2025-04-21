package org.example.roman_to_integer;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        if (s == null || s.length() == 0 || s.length() > 15) return result;
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (j <= s.length() - 2) {
                j++;
            }
            switch (s.charAt(i)) {
                case 'I':
                    if (s.charAt(j) == 'V') {
                        result += 4;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'X') {
                        result += 9;
                        i++;
                        j++;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (s.charAt(j) == 'L') {
                        result += 40;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'C') {
                        result += 90;
                        i++;
                        j++;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (s.charAt(j) == 'D') {
                        result += 400;
                        i++;
                        j++;
                    } else if (s.charAt(j) == 'M') {
                        result += 900;
                        i++;
                        j++;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
            i++;
        }
        return result;

    }

//    public int romanToInt(String s) {
//        int ans = 0, num = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            switch (s.charAt(i)) {
//                case 'I':
//                    num = 1;
//                    break;
//                case 'V':
//                    num = 5;
//                    break;
//                case 'X':
//                    num = 10;
//                    break;
//                case 'L':
//                    num = 50;
//                    break;
//                case 'C':
//                    num = 100;
//                    break;
//                case 'D':
//                    num = 500;
//                    break;
//                case 'M':
//                    num = 1000;
//                    break;
//            }
//            if (4 * num < ans)
//                ans -= num;
//            else
//                ans += num;
//        }
//        return ans;
//
//    }
}
