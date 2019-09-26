package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        Map<String,String> map = new HashMap<String, String>();
        while (true) {
            String city = reader.nextLine();

            if (city.isEmpty()) {
                break;
            } else {
            String family = reader.nextLine();

            map.put(city,family);
        }}

        String key = reader.nextLine();
        System.out.println(map.get(key));


    }
}
