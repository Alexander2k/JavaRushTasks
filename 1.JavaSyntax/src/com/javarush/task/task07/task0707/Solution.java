package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");

        System.out.println(list.size());
        list.forEach((n)-> System.out.println(n));

    }
}
