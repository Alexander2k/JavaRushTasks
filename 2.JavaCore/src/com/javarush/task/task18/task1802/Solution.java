package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        FileInputStream inputStream = new FileInputStream(scanner.nextLine());
        int min = Integer.MAX_VALUE;

        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            if (data < min)
            {
                min = data;
            }
        }

        inputStream.close();
        System.out.println(min);
    }
}
