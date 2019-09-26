package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        HashMap<String,Integer> map = new HashMap<>();

        while (true){

            String id = reader.readLine();

            if (id.isEmpty())
            {
                printHash(map);
                break;

            }
            
            else {
                String name = reader.readLine();
                map.put(name,Integer.parseInt(id));
            }
        }



    }
    public static void printHash (HashMap<String,Integer> map){

        for (HashMap.Entry<String,Integer> pair :map.entrySet())
        {
            String key = pair.getKey();
            int value = pair.getValue();

            System.out.println(value+" "+key);
        }
    }
}
