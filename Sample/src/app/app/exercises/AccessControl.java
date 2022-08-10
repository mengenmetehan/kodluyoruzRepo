package app.app.exercises;

import java.util.Scanner;

public class AccessControl {
    public static void control(){
        String username, password;

        Scanner kb = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz");
        username = kb.nextLine();
        System.out.print("Parolayı giriniz");
        password = kb.nextLine();

        if(username.equals("Mete Han Mengen") && password.equals("123456"))
            System.out.println("Giriş başarılı !");
        else
            System.out.println("Giriş başarısız !");

    }
}
