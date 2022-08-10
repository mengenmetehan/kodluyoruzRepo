package com.metehanmengen.app.exercises;

import java.util.Scanner;

public class MarkControl {
    public static void main(String[] args) {
        int math, physics, turkish, biology, music;
        int average;
        int totalLessonNo = 0;
        int totalNote = 0;

        Scanner kb = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        math = kb.nextInt();
        if(!(math <= 0 || math > 100)) {
            totalNote += math;
            totalLessonNo++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        physics = kb.nextInt();
        if(!(physics <= 0 || physics > 100)) {
            totalNote += physics;
            totalLessonNo++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = kb.nextInt();
        if(!(turkish <= 0 || turkish > 100)) {
            totalNote += turkish;
            totalLessonNo++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        biology = kb.nextInt();
        if(!(biology <= 0 || biology > 100)) {
            totalNote += biology;
            totalLessonNo++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        music = kb.nextInt();
        if(!(music <= 0 || music > 100)) {
            totalNote += music;
            totalLessonNo++;
        }

        average = totalNote / totalLessonNo;


        if(average <= 55) {
            System.out.println("Geçme durumu: Kaldınız, seneye görüşürüz!");
        } else {
            System.out.println("Geçme durumu: Geçtiniz, tebrik ederiz!");
        }

        System.out.println("Ortalamanız: " + average);
    }
}

