package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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


        if ((number1 == number2) && (number2 == number3) )System.out.println(number1+" "+number2+" "+number3);
        else if (number2 == number3) System.out.println(number2+" "+number3);
        else if (number3 == number1) System.out.println(number3+" "+number1);
        else if (number1 == number2) System.out.println(number1+" "+number2);

    }
}