package com.metehanmengen.app.exercises;

import java.util.Scanner;

public class Asterisk {
    public static void start()
    {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int k = 0; k < n / 2 - i; k++)
                System.out.print(" ");
            for (int j = n - i * 2 - 1; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++){
            for (int k = 0; k <= i; k++)
                System.out.print(" ");
            for (int j = i; j < n - i - 2; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
