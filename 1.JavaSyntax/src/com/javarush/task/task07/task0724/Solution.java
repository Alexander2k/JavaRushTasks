package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import javax.sound.midi.Soundbank;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human h1 = new Human("Аня",false,21);
        Human h2 = new Human("Света",false,23);
        Human h3 = new Human("Игорь",true,33);
        Human h4 = new Human("Дима",true,28);

        Human h1_3 = new Human("Егор",true,1,h3,h1);
        Human h2_4 = new Human("Егор",true,7,h4,h2);
        Human h1_3_1 = new Human("Егор",true,3,h3,h1);
        Human h1_3_2 = new Human("Егор",true,4,h3,h1);
        Human h1_3_4 = new Human("Егор",true,2,h4,h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h1_3);
        System.out.println(h2_4);
        System.out.println(h1_3_1);
        System.out.println(h1_3_2);
        System.out.println(h1_3_4);



    }

    public static class Human {
        // напишите тут ваш код

        private String name;
        private boolean sex;
        private int age;

        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}