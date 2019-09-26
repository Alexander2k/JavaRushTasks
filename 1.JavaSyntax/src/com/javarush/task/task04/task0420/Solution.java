package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);

        int number1 = reader.nextInt();
        int number2  = reader.nextInt();
        int number3 = reader.nextInt();

        int max = 0;
        int min = 0;

        max = Math.max(Math.max(number1,number2),number3);
        min = Math.min(Math.min(number1,number2),number3);

        int avr = (number1+number2+number3)- max - min;

        System.out.println(max+" "+avr+" "+min);



    }
}
