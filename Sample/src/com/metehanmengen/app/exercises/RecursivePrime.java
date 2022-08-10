package com.metehanmengen.app.exercises;

import java.util.Scanner;

public class RecursivePrime {
    static boolean isPrime(int n, int i)
    {

        if (n <= 2)
            return n == 2 ? true : false;

        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i++);


    }


    public static void prime()
    {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());


        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

