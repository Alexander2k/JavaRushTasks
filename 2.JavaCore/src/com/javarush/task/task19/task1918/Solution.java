package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader.ready())
        {
            String line = bufferedReader.readLine();
            stringBuilder.append(line);

        }
        bufferedReader.close();

        Document doc =  Jsoup.parse(stringBuilder.toString(),"", Parser.xmlParser());
        for (Element element: doc.select(args[0]))
        {
            System.out.println(element);
        }
    }
}
