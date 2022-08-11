package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class HarmonicArray  {
    public static void run() {
        Scanner kb = new Scanner(System.in);
        System.out.println("dizi uzunluğunu giriniz :");
        int count = Integer.parseInt(kb.nextLine());

        int[] numbers = new int[count];
        int sum = 0;

        for(int i = 0; i < count; i++)
            numbers[i] = i + 1;

        for (int a : numbers)
            sum += 1. / a;

        System.out.println((double)sum / count);
    }
}
