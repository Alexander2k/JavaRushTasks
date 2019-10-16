package com.javarush.task.task18.task1805;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scanner.nextLine());

        Set<Integer> my_set = new TreeSet<>();

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            my_set.add(data);
        }
        inputStream.close();


        for(Integer s : my_set)
        {
            System.out.print(s+" ");
        }
    }
}
