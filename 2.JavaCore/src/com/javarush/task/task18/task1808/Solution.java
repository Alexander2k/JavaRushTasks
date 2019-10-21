package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        FileInputStream readFile1 = new FileInputStream(scanner.nextLine());
        FileOutputStream writeFile2 = new FileOutputStream(scanner.nextLine());
        FileOutputStream writeFile3 = new FileOutputStream(scanner.nextLine());
        scanner.close();

        int count = readFile1.available();
        if (readFile1.available()>0)
        {
            byte[ ] buffer = new  byte[readFile1.available()];

            if (count % 2 == 0) {
                readFile1.read(buffer);
                writeFile2.write(buffer, 0, count / 2);
                writeFile3.write(buffer, count / 2, count / 2);
            } else {
                readFile1.read(buffer);
                writeFile2.write(buffer, 0, count / 2 + 1);
                writeFile3.write(buffer, count / 2 + 1, count / 2);
            }
        }
        readFile1.close();
        writeFile2.close();
        writeFile3.close();



    }
}
