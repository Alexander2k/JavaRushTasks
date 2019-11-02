package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String file = args[0];
        Map<String,Double> my_map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            String key = line[0];
            String value = line[1];
            if (my_map.containsKey(key))
            {
                my_map.put(key,my_map.get(key)+Double.parseDouble(value));
            }
            else {
                my_map.put(key,Double.parseDouble(value));
            }
        }
        reader.close();

        Double myMax = Collections.max(my_map.values());

        for (Map.Entry<String,Double> m : my_map.entrySet())
        {
            if (m.getValue().equals(myMax)) {
                System.out.println(m.getKey());
            }
        }

    }
}
