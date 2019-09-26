package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        Scanner reader = new Scanner(System.in);
        int max = Integer.MAX_VALUE;

        list.add(reader.nextLine());
        list.add(reader.nextLine());
        list.add(reader.nextLine());
        list.add(reader.nextLine());
        list.add(reader.nextLine());

        for (int i = 0; i< list.size();i++){
            String word = list.get(i);
            if (word.length()<max){
                max = word.length();
            }

        }

        for (String s : list) {
            if (s.length() == max){
                System.out.println(s);
            }
        }


    }
}
