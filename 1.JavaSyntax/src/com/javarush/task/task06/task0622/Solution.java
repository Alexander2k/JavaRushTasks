package com.javarush.task.task06.task0622;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<Integer>();


        //напишите тут ваш код

        for (int i=0; i< 5;i++){
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        Collections.sort(numbers);

        numbers.forEach((n) -> System.out.println(n));
    }
}
