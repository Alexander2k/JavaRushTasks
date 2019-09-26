package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name_file = reader.readLine();
        reader.close();

        BufferedReader file_reader = new BufferedReader(new InputStreamReader(new FileInputStream(name_file)));

        ArrayList<Integer> list = new ArrayList<>();

        while (file_reader.ready())
        {
            String number = file_reader.readLine();
            if (Integer.parseInt(number) % 2 == 0)
            {
                list.add(Integer.parseInt(number));
            }
        }

        file_reader.close();

        Collections.sort(list);

        list.forEach((n)-> System.out.println(n));


    }
}
