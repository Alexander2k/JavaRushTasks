package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = null;
        boolean flag = true;

        while (flag) {
            try {
                file = reader.readLine();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                System.out.println(file);
                flag = false;

            }
        }
        reader.close();

    }
}

