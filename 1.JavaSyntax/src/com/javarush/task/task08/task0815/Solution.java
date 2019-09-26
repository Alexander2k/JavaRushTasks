package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();

        map.put("Казанцев","Вадим");
        map.put("Сергеев","Вадим");
        map.put("Ким","Юрий");
        map.put("Тишаков","Вадим");
        map.put("Бородин","Андрей");
        map.put("Лишаков","Вадим");
        map.put("Тадевосян","Карэн");
        map.put("Телерман","Вадим");
        map.put("Гончаров","Александр");
        map.put("Лазарев","Александр");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();


        for (Map.Entry<String,String> pair: map.entrySet()){
            String value = pair.getValue();
            list.add(value);
        }



        return Collections.frequency(list,name);
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<String,String> pair: map.entrySet()){
            String key = pair.getKey();
            list.add(key);
        }




        return Collections.frequency(list,lastName);

    }

    public static void main(String[] args) {

        //Map<String,String> map = createMap();
        //System.out.println(map);
        //System.out.println(getCountTheSameFirstName(map,"Вадим"));
        //System.out.println(getCountTheSameLastName(map,"Казанцев"));

    }
}
