package com.metehanmengen.app.exercises;

import java.util.Scanner;

public class RecursivePow {
    static int recursivePow(int baseNumber, int powerBase)
    {
        if (powerBase <= 1)
            return baseNumber;

        return baseNumber * recursivePow(baseNumber, --powerBase);
    }

    public static int recursive ()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("taban kuvveti giriniz :");
        int n = Integer.parseInt(kb.nextLine());
        System.out.println("üs kuvvetini giriniz :");
        int m = Integer.parseInt(kb.nextLine());

        return recursivePow(n,m);
    }
}
