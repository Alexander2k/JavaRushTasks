package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String,Cat> map = new HashMap<String, Cat>();
        map.put("A",new Cat("Cat1"));
        map.put("B",new Cat("Cat2"));
        map.put("C",new Cat("Cat3"));
        map.put("D",new Cat("Cat4"));
        map.put("E",new Cat("Cat5"));
        map.put("I",new Cat("Cat6"));
        map.put("J",new Cat("Cat7"));
        map.put("K",new Cat("Cat8"));
        map.put("L",new Cat("Cat9"));
        map.put("M",new Cat("Cat10"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();

        for (Map.Entry<String, Cat> c : map.entrySet())
        {

            Cat value = c.getValue();

            set.add(value);
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
