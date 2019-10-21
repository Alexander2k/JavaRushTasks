package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(file1); // запись в файл1
        FileInputStream readFile2 = new FileInputStream(file2); //чтение файла2
        FileInputStream readFile3 = new FileInputStream(file3); //чтение файла3

        reader.close();

        if (readFile2.available()>0)
        {
            byte[] buffer = new byte[readFile2.available()];
            readFile2.read(buffer);
            outputStream.write(buffer);
        }
        if (readFile3.available()>0)
        {
            byte[] buffer = new byte[readFile3.available()];
            readFile3.read(buffer);
            outputStream.write(buffer);
        }


        outputStream.close();
        readFile2.close();
        readFile3.close();
    }
}
