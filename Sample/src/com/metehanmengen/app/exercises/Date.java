package com.metehanmengen.app.exercises;

public class Date {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static int getDays(int month, int year)
    {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }

    public static void printSuffix(int day)
    {
        switch (day) {
            case 1, 21, 31 -> System.out.print("st");
            case 2, 22 -> System.out.print("nd");
            case 3, 23 -> System.out.print("rd");
            default -> System.out.print("th");
        }
    }

    public static void printMonth(int month)
    {
        switch (month) {
            case 1 -> System.out.print("Jan");
            case 2 -> System.out.print("Feb");
            case 3 -> System.out.print("Mar");
            case 4 -> System.out.print("Apr");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("Jun");
            case 7 -> System.out.print("Jul");
            case 8 -> System.out.print("Aug");
            case 9 -> System.out.print("Sep");
            case 10 -> System.out.print("Oct");
            case 11 -> System.out.print("Nov");
            case 12 -> System.out.print("Dec");
        }
    }

    public static void printRandomDate(java.util.Random r)
    {
        int year = r.nextInt(2100 - 1900 + 1) + 1900;
        int month = r.nextInt(12) + 1;
        int day = r.nextInt(getDays(month, year)) + 1;

        System.out.println("----------------------------------------");
        System.out.printf("%02d/%02d/%04d%n", day, month, year); //test amaçlı
        System.out.print(day);
        printSuffix(day);
        System.out.print(' ');
        printMonth(month);
        System.out.print(' ');
        System.out.println(year);
        System.out.println("----------------------------------------");
    }

    public static void printRandomDate()
    {
        printRandomDate(new java.util.Random());
    }
}