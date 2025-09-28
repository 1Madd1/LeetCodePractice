package org.example.username_validation;

import java.util.Scanner;

public class UsernameValidation {
    public static String CodelandUsernameValidation(String str) {
        String username = str;
        if (username.length() < 4 || username.length() > 25) {
            return "false";
        } else if (Character.isDigit(username.charAt(0))) {
            return "false";
        } else if (!username.matches("[A-Za-z0-9_]+")) {
            return "false";
        } else if (username.endsWith("_")) {
            return "false";
        }
        return "true";
    }
}
