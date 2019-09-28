package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner reader = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();

        String key ;
        String param;

        String line = reader.nextLine().split("\\?")[1];

        String[] split = line.split("&");


        for (int i = 0; i < split.length; i++) {
            try {
                key = split[i].split("=")[0];
                try {
                    param = split[i].split("=")[1];
                }
                catch (Exception e)
                {
                    param = "null";
                }
                map.put(key,param);

            }catch (Exception e){
                System.out.println(e);
            }
        }

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.print(entry.getKey()+" ");
        }
        System.out.println();



        if (map.containsKey("obj")){
            try {
                String param_o = map.get("obj");
                alert(Double.parseDouble(param_o));
            }
            catch (Exception e)
            {
                alert(map.get("obj"));
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
