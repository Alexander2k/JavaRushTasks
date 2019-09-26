package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        return str;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        return number;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);
        double number = reader.nextDouble();
        return number;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner reader = new Scanner(System.in);
        boolean input = reader.nextBoolean();
        return input;

    }

    public static void main(String[] args) throws Exception {

    }
}
