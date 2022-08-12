package com.metehanmengen.app.exercises.game;

import java.util.Scanner;

public class PalindromeString {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Pallindrom sayı tahmin ediniz: ");

        String str = kb.nextLine();

        int left = 0;
        int right = str.length() - 1;


        System.out.printf("%s sayısı palindrom mudur ? : %b", str, isPalindrome(str.toLowerCase(), left, right));
    }

    public static boolean isPalindrome(String str, int left, int right)
    {
        while(left < right){
            char leftCh = str.charAt(left);
            if(Character.isWhitespace(leftCh)){
                ++left;
                continue;
            }

            char rightCh =  str.charAt(right);
            if(Character.isWhitespace(rightCh)){
                --right;
                continue;
            }

            if (leftCh != rightCh)
                return false;

            ++left;
            --right;
     }
        return true;
    }
}
