package app.app.exercises;

import java.util.Scanner;

public class kdvCalculator {

    public static void calculator ()
    {
        double price, ratio =0.18, pricesWithKDV , KDV;
        Boolean kdvStatus;


        Scanner kb = new Scanner(System.in);
        System.out.print("Bir tutar giriniz:");
        price = kb.nextDouble();

        kdvStatus = (0<price)&&(1000>price);
        ratio = kdvStatus ? 0.18 : 0.08;


        KDV = price * ratio;
        pricesWithKDV = price + KDV;

        System.out.println("Kdv Orani:"+ ratio);
        System.out.println("Kdv'si:"+ KDV);
        System.out.println("Kdv'li Tutar:"+ pricesWithKDV);
    }
}
