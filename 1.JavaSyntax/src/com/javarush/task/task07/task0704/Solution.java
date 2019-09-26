package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] array = new int [10];

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            int s = reader.nextInt();
            array[i] = s;
        }

        for (int i = 1; i < array.length + 1; i++){
            System.out.println(array[array.length - i]);
        }


    }
}

