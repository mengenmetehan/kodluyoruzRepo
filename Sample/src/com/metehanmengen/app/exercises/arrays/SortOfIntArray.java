package com.metehanmengen.app.exercises.arrays;

import java.util.Random;
import java.util.Scanner;

public class SortOfIntArray {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Dizi uzunluğunu giriniz: ");
        int n = Integer.parseInt(kb.nextLine());
        int [] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("dizinin %d. elemanını giriniz:%n", i + 1 );
            int a = Integer.parseInt(kb.nextLine());
            numbers[i] = a;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("dizinin %d. elemanı %d'dir.%n", i + 1, numbers[i] );
        }

    }
}
