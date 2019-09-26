package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("JANUARY 1 2012"));
        map.put("Шварц", dateFormat.parse("FEBRUARY 2 2012"));
        map.put("Нео", dateFormat.parse("MARCH 3 2012"));
        map.put("Касл", dateFormat.parse("APRIL 4 2012"));
        map.put("Стетхем", dateFormat.parse("MAY 5 2012"));
        map.put("Чак", dateFormat.parse("JUNE 6 2012")); //
        map.put("Марк", dateFormat.parse("JULY 7 2012")); //
        map.put("Дольф", dateFormat.parse("AUGUST 8 2012")); //
        map.put("Рипли", dateFormat.parse("SEPTEMBER 9 2012"));
        map.put("Цезарь", dateFormat.parse("OCTOBER 10 2012"));

        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            int date = pair.getValue().getMonth();

            if (date == 5 || date == 6 || date == 7){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        //Map<String,Date> map = createMap();
//
        //removeAllSummerPeople(map);
        //map.forEach((k,v) -> System.out.println(k+" "+v));
    }
}