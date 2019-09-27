package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) throws IOException {




    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try{
            readKeyFromConsoleAndInitPlanet();
        }
        catch (Exception e ){
            System.out.println(e);
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        InputStream in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();

        if (word.equals(Planet.EARTH))
        {
            thePlanet =  new Earth();
        }
        else if (word.equals(Planet.MOON))
        {
            thePlanet = new Moon();
        }
        else if (word.equals(Planet.SUN))
        {
            thePlanet =  new Sun();
        }
        else thePlanet = null;

    }
}
