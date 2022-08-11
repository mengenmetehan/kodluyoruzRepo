package com.metehanmengen.app.exercises.exercises;

public class FibonacciNumber {
    public static void fibonacciNumber(){
        //ilk 20 fib sayısını bulan döngü
        for (int i = 1; i <= 20; i++)
            System.out.print(getFibonacciNumber(i) +" ");
    }

    private static int getFibonacciNumber(int n)
    {
        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, val = 0;

        for (int i = 2; i < n; ++i) {
            val = prev1 + prev2;
            prev2 = prev1;
            prev1 = val;
        }

        return val;
    }
}
