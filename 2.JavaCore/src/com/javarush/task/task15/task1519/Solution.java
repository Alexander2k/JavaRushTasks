package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while (true)
        {
            String word = reader.readLine();
            try {

                if (word.equals("exit")){
                    break;
                }
                else if (word.contains("."))
                {
                    print(Double.parseDouble(word));
                }
                else if (Integer.parseInt(word) > 0 & Integer.parseInt(word) < 128)
                {
                    print(Short.parseShort(word));
                }
                else if (Integer.parseInt(word) <= 0 | Integer.parseInt(word) >= 128)
                {
                    print(Integer.parseInt(word));
                }
                else print(word);

            }
            catch (Exception e)
            {
                print(word);
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
