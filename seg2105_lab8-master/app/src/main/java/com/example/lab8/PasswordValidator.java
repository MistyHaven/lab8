package com.example.lab8;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean greaterThan10 = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (password.length() >= 10) greaterThan10 = true;

            // If both conditions are met, the password is valid
            if (hasUpperCase && hasLowerCase && hasNumber && greaterThan10) return true;

        }
        return false;
    }
}
