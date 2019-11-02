package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        int all_count = 0;
        int space_count = 0;

        FileInputStream inputStream = new FileInputStream(file);

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (data == 32)
            {
                space_count+=1;
                all_count+=1;
            }
            else {
                all_count+=1;
            }
        }
        inputStream.close();


        System.out.printf("%.2f",(double)space_count/all_count*100);
    }
}
