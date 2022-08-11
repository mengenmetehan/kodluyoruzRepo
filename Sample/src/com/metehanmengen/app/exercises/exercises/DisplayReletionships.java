package com.metehanmengen.app.exercises.exercises;

public class DisplayReletionships {
    public static void displayRelations(int a, int b, int c)
    {
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - max - min;

        if (min < mid)
            System.out.printf("%d < %d ", min, mid);
        else
            System.out.printf("%d = %d ", min, mid);

        if (mid < max)
            System.out.printf("< %d%n", max);
        else
            System.out.printf("= %d%n", max);
    }

    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());

        System.out.print("İkinci sayıyı giriniz:");
        int b = Integer.parseInt(kb.nextLine());

        System.out.print("Üçüncü sayıyı giriniz:");
        int c = Integer.parseInt(kb.nextLine());

        displayRelations(a, b, c);
    }
}

