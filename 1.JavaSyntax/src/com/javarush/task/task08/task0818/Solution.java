package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();

        map.put("Abvr", 1000);
        map.put("Ala", 700);
        map.put("asad", 950);
        map.put("sadsa", 820);
        map.put("Aadf", 650);
        map.put("adfw", 320);
        map.put("Aadasd", 770);
        map.put("Aadfds", 230);
        map.put("Abvrdasd", 500);
        map.put("Abvrdsf", 100);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> pair = iterator.next();

            Integer value = pair.getValue();

            if (value<500){
                iterator.remove();
            }
        }

        //System.out.println(map);
    }

    public static void main(String[] args) {

        //Map<String,Integer> map = createMap();
        //removeItemFromMap(map);

    }
}
