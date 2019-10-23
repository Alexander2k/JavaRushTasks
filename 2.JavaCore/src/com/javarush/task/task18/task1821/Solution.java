package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String file = args[0];
        Map<Character,Integer> my_map = new TreeMap<>();


        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));



        while (bufferedReader.ready()) {

            char letter = (char) bufferedReader.read();
            if (my_map.containsKey(letter))
            {
                my_map.put(letter,my_map.get(letter)+1);

            }
            else
            {
                my_map.put(letter,1);
            }

        }
        //System.out.println(my_map);
        for( Map.Entry<Character,Integer> v : my_map.entrySet())
        {
            Character key = v.getKey();
            Integer value = v.getValue();

            System.out.println(key+" "+value);
        }


        bufferedReader.close();

    }
}
