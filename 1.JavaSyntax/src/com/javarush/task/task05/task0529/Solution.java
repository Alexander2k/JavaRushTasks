package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int summ = 0;

        while (true){
            Scanner reader = new Scanner(System.in);
            String input = reader.nextLine();
            if (input.equals("сумма")){
                break;
            }else {
                summ+= Integer.parseInt(input);
            }
        }
        System.out.println(summ);
    }
}
