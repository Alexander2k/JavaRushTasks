package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {

        String class_name = Thread.currentThread().getStackTrace()[2].getClassName();
        String method_name = Thread.currentThread().getStackTrace()[2].getMethodName();

        System.out.println(class_name+": "+method_name+": "+s);
    }
}
