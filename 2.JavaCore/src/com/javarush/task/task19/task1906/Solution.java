package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        String file1 = bufferedReader.readLine();
        bufferedReader.close();
        FileReader reader = new FileReader(file);
        FileWriter writer = new FileWriter(file1);

        while (reader.ready())
        {
            int data = reader.read();
            int data2= reader.read();
            writer.write(data2);
        }
        reader.close();
        writer.close();

    }
}
