package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {


    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i<10;i++){
            Cat my_cat = new Cat();
            cats.add(my_cat);
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
       cats.forEach((n) -> System.out.println(n));
    }
}
