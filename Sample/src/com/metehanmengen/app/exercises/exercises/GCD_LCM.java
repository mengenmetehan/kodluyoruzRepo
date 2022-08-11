package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class GCD_LCM {
    public static void gcd()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int n = Integer.parseInt(kb.nextLine());
        System.out.println("2. sayıyı giriniz");
        int m = Integer.parseInt(kb.nextLine());

        int min = Math.min(n,m);

        while (min > 1) {
            if (n % min == 0 && m % min == 0) {
                System.out.println("gcd = " + min);
                break;
            }
            min--;
        }
        if (min == 1)
            System.out.println("2 sayının gcd'si 1");

    }
    public static void lcm()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int n = Integer.parseInt(kb.nextLine());
        System.out.println("2. sayıyı giriniz");
        int m = Integer.parseInt(kb.nextLine());

        int max = m * n;

        int i = 2;
        while (i < max) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("lcm = " + i);
                break;
            }
            i++;
        }
        if (i == max)
            System.out.println("2 sayının lcm'si " + max);

    }

}
