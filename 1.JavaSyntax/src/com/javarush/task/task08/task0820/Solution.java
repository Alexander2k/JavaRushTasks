package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        //System.out.println("***************************");
        printPets(pets);
        //System.out.println("***************************");

        removeCats(pets, cats);
        //System.out.println("***************************");
        printPets(pets);
        //System.out.println("***************************");
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        //напишите тут ваш код
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> all = new HashSet<Object>();

        all.addAll(cats);
        all.addAll(dogs);

        return all;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for (Cat c:cats){
            pets.remove(c);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object p:pets) System.out.println(p);
    }

    //напишите тут ваш код
    public static class Cat{}
    public static class Dog{}
}
