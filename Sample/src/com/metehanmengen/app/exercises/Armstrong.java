package com.metehanmengen.app.exercises;

public class Armstrong {
    public static boolean isArmstrong(int val)
    {
        return val >= 0 && val == getDigitsPowSum(val);
    }

    public static int getDigitsPowSum(int val)
    {
        int count = digitsCount(val);
        int sum = 0;

        while (val != 0) {
            sum += pow(val % 10, count);
            val /= 10;
        }

        return sum;
    }

    public static int digitsCount(int val)
    {
        int count = 0;

        do {
            ++count;
            val /= 10;
        } while (val != 0);

        return count;
    }

    public static int pow(int a, int b)
    {
        int result = 1;

        while (b-- > 0)
            result *= a;

        return result;
    }
}
