package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int max_pos = 0;
        int min_pos = 0;

        for (int i=0; i< 10;i++){
            list.add(reader.nextLine());
        }

        //находим самое длинное слово
        for (int i=0;i<10;i++){
            if (list.get(i).length()>max){
                max = list.get(i).length();
            }
        }

        //находим самое короткое слово
        for (int i=0;i<10;i++){
            if (list.get(i).length()<min){
                min = list.get(i).length();
            }
        }

        for (int i=0;i<list.size();i++){
            if (list.get(i).length() == max){
                max_pos = i;
                break;
            }
        }

        for (int i=0;i<list.size();i++){
            if (list.get(i).length() == min){
                min_pos = i;
                break;
            }
        }

        if (max_pos<min_pos)
            System.out.println(list.get(max_pos));
        else System.out.println(list.get(min_pos));


    }
}
