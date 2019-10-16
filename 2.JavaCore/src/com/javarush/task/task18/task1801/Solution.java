package com.javarush.task.task18.task1801;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        while (fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            if (data > max){
                max = data;
            }

        }
        fileInputStream.close();
        System.out.println(max);
    }
}
