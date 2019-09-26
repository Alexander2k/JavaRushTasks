package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
       // System.out.println("Enter N lines: ");
        int N = Integer.parseInt(reader.readLine());
        //System.out.println("Enter M operations: ");
        int M = Integer.parseInt(reader.readLine());

        //System.out.println("Enter list string: ");
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        //System.out.println(list);
        //System.out.println("List operations: ");
        for (int i = 0; i < M ; i++) {
            list.add(list.remove(0));
        }

        list.forEach((n)-> System.out.println(n));


        //напишите тут ваш код
    }
}
