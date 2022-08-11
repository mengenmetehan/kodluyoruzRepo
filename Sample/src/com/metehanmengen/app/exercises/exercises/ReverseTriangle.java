package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class ReverseTriangle {
    public static void reverseTriangle(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Kaç basamaklı ters üçgen : ");
        int count = Integer.parseInt(kb.nextLine());

        for(int i = 0; i < 2 * count - 1; i++)
            System.out.print("*");
        System.out.println();

        for(int i = 0; i < count - 1; i++) {
            for (int k = 0; k <= i; k++)
                System.out.print(" ");
            for (int j = (count - 1 - i) * 2 - 1; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }

    }
}
