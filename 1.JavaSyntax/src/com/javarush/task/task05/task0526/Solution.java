package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man my_men = new Man("Den",23,"Moscow");
        Man my_men2 = new Man("Alex",24,"Moscow");
        Woman my_women = new Woman("Lily",21,"London");
        Woman my_women2 = new Woman("Anna",23,"London");
        System.out.println(my_men.name+" "+my_men.age+" "+my_men.address);
        System.out.println(my_men2.name+" "+my_men2.age+" "+my_men2.address);
        System.out.println(my_women.name+" "+my_women.age+" "+my_women.address);
        System.out.println(my_women2.name+" "+my_women2.age+" "+my_women2.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name){
            this.name = name;
        }

        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }



    }

    public static class Woman{

        String name;
        int age;
        String address;

        public Woman(String name){
            this.name = name;
        }

        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    //напишите тут ваш код
}
