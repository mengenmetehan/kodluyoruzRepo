package com.metehanmengen.app.exercises.exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FixtureGenerator {
    public static void generateFixture(int teamSize)
    {
        Scanner kb = new Scanner(System.in);

        int roundCount = (teamSize - 1) * 2;
        int matchCountPerRound = teamSize % 2 == 0 ? teamSize / 2 : (teamSize + 1) / 2;


        // takım listesini oluşturuyoruz.
        List<String> teamList = new ArrayList<>();

        for (int i = 0; i < teamSize; i++) {
            System.out.println(i + 1 + ". takımı giriniz .");
            teamList.add(kb.nextLine());
        }

        List<String> reversedList = new ArrayList<>();

        for (int i = teamList.size() - 1; i >= 0 ; i--) {
            reversedList.add(teamList.get(i));
        }



        for (int i = 1; i <= roundCount; i++)
        {
            System.out.println(i + ". Tur");

            // İlk tur için normal sırayla maçları oynatıyoruz.
            for (int k = 0; k < matchCountPerRound; k++)
            {
                int firstIndex = k;
                int secondIndex = teamSize - 1 - k;

                System.out.println(teamList.get(firstIndex) + " - " + teamList.get(secondIndex));
            }

            //2. haftadan itibaren : sonuncu takım 2. takım, 2. takım 3. takım, 3. takım 4. takım şeklinde ilerletiyoruz.
            List<String> newTeamList = new ArrayList<>();

            newTeamList.add(teamList.get(0));  //ilk eleman sabit diğerleri kayacak
            newTeamList.add(teamList.get(teamList.size() - 1));  //son eleman artık 2. eleman

            for (int k = 1; k < teamList.size() - 1; k++)
            {
                newTeamList.add(teamList.get(k));
            }

            if (i >= 6)
                teamList = reversedList;
            else
                teamList = newTeamList;

        }



    }








}
