package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class BiggestNumberSmallestNumber {
    public static void calculator() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz");
        int count = Integer.parseInt(kb.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= count ; i++) {
            System.out.println(i +". sayıyı giriniz : ");
            int val = Integer.parseInt(kb.nextLine());
            if (val < min)
                min = val;

            if(val > max)
                max = val;
        }
        System.out.println("Max : " + max + ", " + "Min : " + min);


    }
}
