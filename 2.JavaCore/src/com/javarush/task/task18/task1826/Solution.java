package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length > 0) {
            if (args[0].equals("-e")) {
                CodingFile(args);
            }
            if (args[0].equals("-d")) {
                DecodeFile(args);
            }
        }

    }

    private static void CodingFile(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[1]));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[2]));

        while (bufferedReader.ready()){
            int data = bufferedReader.read();
            data+=1;
            bufferedWriter.write(data);
        }
        bufferedReader.close();
        bufferedWriter.close();

    }

    private static void DecodeFile(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[1]));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[2]));


        while (bufferedReader.ready()){
            int data = bufferedReader.read();
            data-=1;
            bufferedWriter.write(data);
        }
        bufferedReader.close();
        bufferedWriter.close();

    }

}
