package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();


    public static void main(String[] args) {

        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream my_print = new PrintStream(byteArrayOutputStream);

        System.setOut(my_print);
        testString.printSomething();

        String result = byteArrayOutputStream.toString().toUpperCase();

        System.setOut(printStream);
        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
