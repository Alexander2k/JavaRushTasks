package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] array = new String[10];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 8; i++){
            String s = reader.nextLine();

            array[i] = s;

        }

        for (int i = 1; i < array.length+1; i++){
            System.out.println(array[array.length-i]);
        }
    }
}