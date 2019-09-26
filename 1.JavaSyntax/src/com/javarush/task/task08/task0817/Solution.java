package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
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
        map.put("Орлов","Александр");
        map.put("Лазарев","Александр");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String value = pair.getValue();
            list.add(value);
        }

        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list,list.get(i) ) >=2){
                removeItemFromMapByValue(map,list.get(i));
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

        //Map<String,String> m_map= createMap();
        //removeTheFirstNameDuplicates(m_map);
        //System.out.println(m_map);


    }
}
