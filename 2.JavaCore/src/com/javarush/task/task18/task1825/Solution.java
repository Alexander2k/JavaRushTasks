package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileList = new ArrayList<>();
        boolean flag = true;


        while (flag) {
            String file = reader.readLine();
            if (file.equals("end")) {
                flag = false;
            } else {
                fileList.add(file);
            }
        }
        reader.close();

        writeToFile(fileList);
    }

    private static void writeToFile(List<String> fileList) throws IOException {
        Collections.sort(fileList);
        String fileToWrite = fileList.get(0).split(".part")[0];
        for (String s : fileList) {

            BufferedReader reader = new BufferedReader(new FileReader(s));

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite));

            while (reader.ready()) {
                writer.write(reader.read());
            }
            reader.close();
            writer.close();
        }
    }
}
