package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);

        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        int number3 = reader.nextInt();
        int number4 = reader.nextInt();

        int max1 = Math.max(number1,number2);
        int max2 = Math.max(number3,number4);

        System.out.println(Math.max(max1,max2));

    }
}
