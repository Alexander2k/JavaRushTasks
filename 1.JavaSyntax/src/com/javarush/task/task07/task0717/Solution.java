package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);

        for (int i =0;i<10;i++ ){
            list.add(reader.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        result.forEach((n) -> System.out.println(n));
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> n = new ArrayList<String>();
        for (int i=0; i<list.size();i++){
            n.add(list.get(i));
            n.add(list.get(i));
        }

        return n;
    }
}
