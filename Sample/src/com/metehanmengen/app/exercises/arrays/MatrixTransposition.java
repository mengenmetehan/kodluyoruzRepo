package com.metehanmengen.app.exercises.arrays;

import java.util.Random;
import java.util.Scanner;

public class MatrixTransposition {
    public static void  run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Satır sayısını giriniz: ");
        int n = Integer.parseInt(kb.nextLine());

        System.out.println("Sütun sayısını giriniz: ");
        int m = Integer.parseInt(kb.nextLine());

        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++)
            for(int k = 0; k < m; k++)
                matrix[i][k] = random.nextInt(0, 100);

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++)
                System.out.printf("%02d ", matrix[i][k]);
            System.out.println();
        }
        System.out.println("-----------------------------------");

        int rvsMatrix [][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for(int k = 0; k < n; k++)
                rvsMatrix[i][k]  = matrix[k][i];

        for (int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++)
                System.out.printf("%02d ", rvsMatrix[i][k]);
            System.out.println();
        }



    }
}
