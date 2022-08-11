package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class RecursivePatternMethods {
    private int m_count;
    int setFiveMinus(int n)
    {
        System.out.print(n + " ");

        if (n <= 0)
            return setFivePlus(n);

        return setFiveMinus(n - 5);
    }

    int setFivePlus(int n)
    {
        if(n == m_count)
            return 1;
        n += 5;
        System.out.print(n + " ");

        return setFivePlus(n);

    }

    public void setFiveMinus()
    {

        Scanner kb = new Scanner(System.in);
        System.out.println("bir sayı giriniz :");
        int n = Integer.parseInt(kb.nextLine());
        m_count = n;

        setFiveMinus(n);
        System.out.println();



    }
}
