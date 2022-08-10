package com.metehanmengen.app.exercises;

public class PrimeNumber {
    public static void isPrimeNumbers()
    {
        for (int a = 2; a < 100; ++a) {
            if (isPrime(a) )
                System.out.printf("%d  ", a);
        }
    }

    public static boolean isPrime(long val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        for (long i = 11; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }
}
