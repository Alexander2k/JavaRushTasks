package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        Pattern pattern = Pattern.compile("\\b(-?\\d+)\\b", Pattern.UNICODE_CHARACTER_CLASS);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

        while (bufferedReader.ready())
        {
            String[] line = bufferedReader.readLine().split(" ");
            for(String s : line)

            {
                Matcher matcher = pattern.matcher(s);
                while (matcher.find())
                {
                    bufferedWriter.write(matcher.group()+" ");
                }
            }

        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
