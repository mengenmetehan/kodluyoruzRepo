package com.metehanmengen.app.exercises.exercises;

import java.util.Scanner;

public class ATM {
    public static void doWorkForCard(){
        String username, password;
        Scanner kb = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right != 0) {
            System.out.println("Kullanıcı adını giriniz: ");
            username = kb.nextLine();
            System.out.println("Parolayı giriniz: ");
            password = kb.nextLine();

            if (username.equals("Mete Han MENGEN") && password.equals("123456")) {
                System.out.println("Başarılı giriş yaptınız : ");
                System.out.println("1 - Para Yatırma %r 2- Para Çekme %r 3- Bakiye Sorgulama %r 4- Çıkış Yap");
                select = Integer.parseInt(kb.nextLine());

                switch (select) {
                    case 1:
                        doWorkForSelect1(balance);
                        break;
                    case 2:
                        doWorkForSelect2(balance);
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;
                    case 4:
                        System.out.println("Çıkış yaptınız:");
                        System.exit(1);
                }
            }
                 else {
                --right;
                System.out.println("Yanlış giriş yaptınız : Hakkınız " + right);
            }
        }

        if (right == 0)
            System.out.println("Kartınız bloke olmuştur.");
        else
            System.out.println("Kalan hakkınız : " + balance);

    }
    public static int doWorkForSelect1(int balance)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("para miktarı");
        int price = Integer.parseInt(kb.nextLine());
        balance += price;

        return balance;
    }

    public static int doWorkForSelect2(int balance)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("para miktarı");
        int price = Integer.parseInt(kb.nextLine());
        if (balance >= price)
            balance -= price;
        else
            System.out.println("Bakiye yetersiz: ");

        return balance;
    }




}
