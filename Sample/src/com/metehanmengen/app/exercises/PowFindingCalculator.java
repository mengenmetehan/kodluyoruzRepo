package com.metehanmengen.app.exercises;

import java.util.Scanner;

public class PowFindingCalculator {
    public static void calculator()
    {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 1; i <= n; i*=3)
        {
            System.out.println(i);
        }

        for (int i = 1; i <= n; i*=4)
        {
            System.out.println(i);
        }
    }
}
