package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        String file = reader.nextLine();
        reader.close();

        String id = args[0];


        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        while (bufferedReader.ready()) {
            String[] data = bufferedReader.readLine().split(" ");
            if (data[0].equals(id))
            {
                System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+data[3]);
            }
        }
        bufferedReader.close();

    }
}
