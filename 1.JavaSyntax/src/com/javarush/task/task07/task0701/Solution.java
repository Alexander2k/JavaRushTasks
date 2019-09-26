package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int [] numbers = new int[20];
        Scanner reader = new Scanner(System.in);

        for (int i =0; i< numbers.length;i++){

            int number = reader.nextInt();
            numbers[i] = number;
        }

        return numbers;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = Integer.MIN_VALUE;

        for (int i =0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
