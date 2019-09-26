package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        Scanner reader = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();


        int count = 1;
        int max = 1;


        for (int i = 0; i < 10; i++) {
            list.add(reader.nextInt());
        }

        //System.out.println(list);

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))){
                count+=1 ;
            } else count=1;

            if (count>max){
                max = count;
            }



    }
        System.out.println(max);
}}