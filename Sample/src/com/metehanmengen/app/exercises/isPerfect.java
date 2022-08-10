package com.metehanmengen.app.exercises;

public class isPerfect {
    public static boolean isPerfect(int a)
    {
        return sumFactors(a) == a;
    }

    public static int sumFactors(int val)
    {
        if (val == 1)
            return 1;

        int result = 0;
        int sqrtVal = (int)Math.sqrt(val);

        for (int i = 2; i <= sqrtVal; ++i)
            if (val % i == 0)
                result += (i == val / i) ? i : (i + val / i);

        return result + 1;
    }
}
