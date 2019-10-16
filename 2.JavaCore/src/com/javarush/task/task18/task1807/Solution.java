package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileInputStream inputStream = new FileInputStream(scanner.nextLine());
        int count = 0;
        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            if (data == 44)
            {
                count+=1;
            }

        }
        inputStream.close();

        System.out.println(count);
    }
}
