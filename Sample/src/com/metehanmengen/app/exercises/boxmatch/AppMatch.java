package com.metehanmengen.app.exercises.boxmatch;

import java.util.Random;

public class AppMatch {
    Random r = new Random();

    Fighter marc = new Fighter("Marc" , 15 , 100, 90, 20);
    Fighter alex = new Fighter("Alex" , 10 , 95, 100, 50);

    Fighter f1 = r.nextBoolean() ? marc : alex;
    Fighter f2 = f1 == marc ? alex : marc;
    Ring ring = new Ring(f1 ,f2,  90 , 100);

}
