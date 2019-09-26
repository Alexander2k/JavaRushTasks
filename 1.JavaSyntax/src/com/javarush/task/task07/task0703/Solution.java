package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] s_arr = new String[10];
        int [] i_arr = new int[10];

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < s_arr.length; i++){
            String number = reader.nextLine();
            s_arr[i] = number;
        }

        for (int i = 0; i < s_arr.length; i++){
            int num = s_arr[i].length();
            i_arr[i] = num;
        }

        for (int i=0; i< i_arr.length; i++){
            System.out.println(i_arr[i]);
        }

    }
}
