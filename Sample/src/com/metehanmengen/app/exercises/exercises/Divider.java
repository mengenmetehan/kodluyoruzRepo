package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class Divider {
    public static void calculator()
    {
        int total3divider = 0;
        int total4divider = 0;
        int count3divider = 0;
        int count4divider = 0;

        for(;;)
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Bir sayı giriniz :");
            int count = Integer.parseInt(kb.nextLine());

            if (count == 0)
                break;
            if (count % 4 == 0)
                total4divider += count;
                count4divider++;

            if (count % 3 == 0)
                total3divider += count;
            count3divider++;

        }
        System.out.println("3 e bölünenlerin ortalaması " + (double)total3divider / count3divider);
        System.out.println("4 e bölünenlerin ortalaması " + (double)total4divider / count4divider);
    }
}
