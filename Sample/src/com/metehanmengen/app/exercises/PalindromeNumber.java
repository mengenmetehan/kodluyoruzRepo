package com.metehanmengen.app.exercises;

public class PalindromeNumber {
    static boolean isPalindrome(int value, int reverseValue)
    {
        return value == reverseValue;
    }
    public static boolean palindrome(int value)
    {
        return isPalindrome(value, reversedNumber(value));
    }

    static int reversedNumber(int value)
    {
        int result = 0;

        while (value != 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }
}
