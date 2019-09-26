package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);

        int number1 = reader.nextInt();
        int number2 = reader.nextInt();


        if (number1==number2){
            System.out.println(number1);
        } else
            System.out.println(Math.min(number1,number2));

    }
}