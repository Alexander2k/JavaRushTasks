package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));



        while (true){
            String line = reader.readLine();

            if (line.equals("exit")){
                writer.write(line);
                break;
            }else {
                writer.write(line+System.lineSeparator());
            }

        }
        reader.close();
        writer.close();

}}
