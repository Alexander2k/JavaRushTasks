package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
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
        map.put("Казанцев","Александр");

        return map;

    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
