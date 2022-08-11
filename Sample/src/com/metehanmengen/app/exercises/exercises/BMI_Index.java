package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class BMI_Index {
    public static void calculator()
    {
        System.out.println("Kilonuzu giriniz :");
        Scanner kb = new Scanner(System.in);

        int weight = Integer.parseInt(kb.nextLine());
        System.out.println("Boyunuzu giriniz :");
        int height = Integer.parseInt(kb.nextLine());

        System.out.printf("BMI : %02f", (double)weight / height * height );

    }
}
