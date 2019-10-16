package com.javarush.task.task18.task1804;

import java.io.FileInputStream;

/* 
Самые редкие байты
*/

import java.util.*;

/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Map<Integer,Integer> map = new HashMap<>();

        FileInputStream inputStream = new FileInputStream(scanner.nextLine());

        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            if (!map.containsKey(data))
            {
                map.put(data,1);
            }
            else {
                //System.out.println("print in else: "+map.get(data));
                map.put(data,map.get(data)+1);
            }

        }

        inputStream.close();

        int minVal = Collections.min(map.values());

        for(Map.Entry<Integer,Integer> item : map.entrySet())
        {
            int key = item.getKey();
            int value = item.getValue();
            if (value == minVal)
            {
                System.out.print(key+" ");
            }
        }



    }
}
