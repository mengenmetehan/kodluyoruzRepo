package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class Harmonic {
    public static void calculator()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        double count = 1.0;

        for (int i = 2; i <= n; i++)
            count += 1. / i;

        System.out.println("total harmonik sayı " + count);

    }
}
