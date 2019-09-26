package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        //напишите тут ваш код

        ArrayList<Integer> i_list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            i_list.add(reader.nextInt());
        }

        Collections.reverse(i_list);

        for (int i = 0; i < i_list.size(); i++) {
            System.out.println(i_list.get(i));
        }
    }
}
