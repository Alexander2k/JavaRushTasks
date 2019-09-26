package com.javarush.task.task08.task0828;

import java.io.IOException;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);

        Map<String,Integer> my_map = createMap();

        String name_m = reader.nextLine().toLowerCase();

        for (Map.Entry<String, Integer> pair : my_map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            int value = pair.getValue()+1;                  //значение
            if (name_m.contains(key.toLowerCase())){
                System.out.println(key+" is the "+value+ " month");
            }
            //System.out.println(key + ":" + value);
        }

    }

    public static Map<String, Integer> createMap (){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("January",Calendar.JANUARY);
        map.put("February",Calendar.FEBRUARY);
        map.put("March",Calendar.MARCH);
        map.put("April",Calendar.APRIL);
        map.put("May",Calendar.MAY);
        map.put("June",Calendar.JUNE);
        map.put("July",Calendar.JULY);
        map.put("August",Calendar.AUGUST);
        map.put("September",Calendar.SEPTEMBER);
        map.put("October",Calendar.OCTOBER);
        map.put("November",Calendar.NOVEMBER);
        map.put("December",Calendar.DECEMBER);

        return map;
    }
}
