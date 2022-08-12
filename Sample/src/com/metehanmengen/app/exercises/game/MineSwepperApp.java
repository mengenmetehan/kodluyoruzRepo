package com.metehanmengen.app.exercises.game;

import java.util.Scanner;

public class MineSwepperApp {
    public static void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        System.out.println("Harita büyüklüğünü giriniz.");
        System.out.print("Satır : ");
        int row = scan.nextInt();
        System.out.print("\bSütun : ");
        int col = scan.nextInt();

        MineSweeper mine = new MineSweeper(row, col); //(rowMax, colMax)
        mine.run();
    }
}
