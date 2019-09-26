package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int [] i_arr = new int[15];
        int street_1 = 0;
        int street_2 = 0;

        Scanner reader = new Scanner(System.in);


        for (int i=0;i< i_arr.length;i++){
            i_arr[i] = reader.nextInt();
        }

        for (int i=0; i < i_arr.length;i++){
            if (i%2==0){
                street_1+=i_arr[i];
            }
            else street_2+=i_arr[i];
        }

        if (street_1<street_2)
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");




    }
}
