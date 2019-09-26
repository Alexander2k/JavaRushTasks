package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }


        for (int i = 0; i < list.length; i++) {
            if (list[i]>maximum){
                maximum = list[i];
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] < minimum){
                minimum = list[i];
            }
        }




        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
