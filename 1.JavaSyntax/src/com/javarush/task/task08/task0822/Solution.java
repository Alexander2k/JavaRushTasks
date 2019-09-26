package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)<min){
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = 0; i < number; i++) {
            list.add(reader.nextInt());
        }
        return list;
    }
}
