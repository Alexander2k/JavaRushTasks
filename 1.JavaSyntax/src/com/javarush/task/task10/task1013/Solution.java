package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private int weight;
        private int height;
        private String eye_color;


        public Human(){

        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name,int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name,int age,boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name,int age,boolean sex,int weight){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name,int age,boolean sex,int weight,int height){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }
        public Human(String name,int age,boolean sex,int weight,int height,String eye_color){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.eye_color = eye_color;
        }
        public Human(String name,int age,int weight,int height){
            this.name = name;
            this.age = age;
            this.sex = true;
            this.weight = weight;
            this.height = height;
            this.eye_color = "Brown";
        }
        public Human(String name,int weight,int height){
            this.name = name;
            this.age = 35;
            this.sex = true;
            this.weight = weight;
            this.height = height;
            this.eye_color = "Green";
        }
        public Human(String name,boolean sex){
            this.name = name;
            this.age = 35;
            this.sex = sex;
            this.eye_color = "Green";
        }




    }
}
