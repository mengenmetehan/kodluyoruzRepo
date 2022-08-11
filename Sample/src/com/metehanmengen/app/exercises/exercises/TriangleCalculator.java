package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        // Değişken Tanımlama
        int number1, number2;
        double number3;

        // Kullanıcıdan Veri Al
        Scanner kb = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        number1 = kb.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        number2 = kb.nextInt();

        number3 = Math.sqrt((number1 * number1) + (number2 * number2));
        System.out.print("Hipotenüs: "+ number3);
    }
}