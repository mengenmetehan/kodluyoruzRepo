package com.metehanmengen.app.exercises;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double km;
        int initiatePrice= 10 ;
        Scanner kb = new Scanner(System.in);
        System.out.print("Km Bilgisi: ");
        km = kb.nextDouble();
        double price = (km * 2.20) + initiatePrice;
        boolean minTutar;
        minTutar = (price <= 20)&(price > 0);
        price  = minTutar ? 20 : price ;
        System.out.println("Taksı Ucretı: "+ price );
    }
}