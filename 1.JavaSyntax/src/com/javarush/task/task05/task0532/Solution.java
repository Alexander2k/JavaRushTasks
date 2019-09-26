package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Scanner;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int maximum = reader.nextInt();


        int cur_max = Integer.MIN_VALUE;

        while (maximum>0){
            int cur_number = reader.nextInt();

            cur_max = Math.max(cur_number,cur_max);

            maximum-=1;
        }

        //напишите тут ваш код

        System.out.println(cur_max);
    }
}
