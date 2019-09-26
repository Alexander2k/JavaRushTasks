package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> [] list = new ArrayList[3];
        Collections.addAll(list[0] = new ArrayList<>(),"1,2,3,4,5");
        Collections.addAll(list[1] = new ArrayList<>(),"2,3,4,5,6");
        Collections.addAll(list[2] = new ArrayList<>(),"3,4,5,6,7");
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}