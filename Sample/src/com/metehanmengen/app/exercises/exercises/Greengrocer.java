package com.metehanmengen.app.exercises.exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greengrocer {
    public static void calculator()
    {
        double pear = 12.25;
        double apple = 13.00;
        double tomato = 11.50;
        double banana = 18.50;
        double pepper = 14.40;

        Scanner kb = new Scanner(System.in);

        System.out.println("How many kilos pear ? ");
        double pearKilo = Double.parseDouble(kb.nextLine());
        System.out.println("How many kilos apple ? ");
        double appleKilo = Double.parseDouble(kb.nextLine());
        System.out.println("How many kilos tomato ? ");
        double tomatoKilo = Double.parseDouble(kb.nextLine());
        System.out.println("How many kilos banana ? ");
        double bananaKilo = Double.parseDouble(kb.nextLine());
        System.out.println("How many kilos pepper ? ");
        double pepperKilo = Double.parseDouble(kb.nextLine());

        double totalPrices = pear * pearKilo + tomatoKilo * tomato + appleKilo * apple + bananaKilo * banana + pepperKilo * pepper;

        System.out.println(totalPrices);
    }
}
