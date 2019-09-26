package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] i_arr = new int[20];
        int [] i_small = new int[10];
        int [] i_small2 = new int[10];

        Scanner reader = new Scanner(System.in);

       for (int i = 0; i < i_arr.length;i++){
           i_arr[i] = reader.nextInt();
       }

        System.arraycopy(i_arr,0,i_small,0,i_arr.length/2);
        System.arraycopy(i_arr,i_arr.length/2,i_small2,0,i_arr.length/2);




       for (int i=0;i<i_small2.length;i++){
           System.out.println(i_small2[i]);
       }


    }
}
