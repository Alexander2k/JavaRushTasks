package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);
        String number = reader.nextLine();

        String [] result = number.split("");

        for (int i= 0;i < result.length;i++){
            int number1 =Integer.parseInt(result[i]);
            if (number1 % 2 == 0){
                even+=1;
            }else odd+=1;

        }

        System.out.println("Even: "+even+" Odd: "+odd);


    }
}
