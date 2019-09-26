package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        strings.add(reader.nextLine());
        strings.add(reader.nextLine());
        strings.add(reader.nextLine());
        strings.add(reader.nextLine());
        strings.add(reader.nextLine());

        for (int i = 0; i< strings.size();i++){
            String word = strings.get(i);
            if (word.length()>max){
                max = word.length();
            }

        }

        for (String s : strings) {
            if (s.length() == max){
                System.out.println(s);
            }
        }
    }
}
