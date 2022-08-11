package com.metehanmengen.app.exercises.arrays;

import java.util.Scanner;

public class Max_Min_Values {
    public static void run()
    {
        int a [] = {15,12,788,1,-1,-778,2,0};

        Scanner kb = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int n = Integer.parseInt(kb.nextLine());
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++)
            if (a[i] < n && (Math.abs(a[i] - n) < Math.abs(minValue - n)))
                minValue = a[i];

        for(int i = 0; i < a.length; i++)
            if (a[i] > n && (Math.abs(a[i] - n) < Math.abs(maxValue - n)))
                maxValue = a[i];

        System.out.printf("%d sayısından küçük en yakın sayı %d sayısından büyük en yakın sayı %d", n, minValue, maxValue);
    }
}
