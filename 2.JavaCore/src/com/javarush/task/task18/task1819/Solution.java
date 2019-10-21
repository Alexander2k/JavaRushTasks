package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Byte> myList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String file1Reader = scanner.nextLine();
        String file2Reader = scanner.nextLine();
        scanner.close();


        FileInputStream streamFile2 = new FileInputStream(file2Reader);



        while (streamFile2.available()>0)
        {
            int data = streamFile2.read();
            myList.add((byte)data);
        }
        streamFile2.close();

        FileInputStream streamFile1 = new FileInputStream(file1Reader);

        while (streamFile1.available()>0)
        {
            int data = streamFile1.read();
            myList.add((byte)data);
        }
        streamFile1.close();

        FileOutputStream writeStream1 = new FileOutputStream(file1Reader);

        writeStream1.flush();
        //System.out.println(myList);

        for (Byte aByte : myList) {
            writeStream1.write(aByte);
        }
        writeStream1.close();





    }
}
