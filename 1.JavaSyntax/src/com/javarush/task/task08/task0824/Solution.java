package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human kid1 = new Human("Sveta",false,23);
        Human kid2 = new Human("Dima",true,25);
        Human kid3 = new Human("Igor",true,21);

        Human mother = new Human("Sveta",false,42);
        Human father = new Human("Igor",true,45);

        Human grand_ma1 = new Human("Zina",false,68);
        Human grand_ma2 = new Human("Valyz",false,69);

        Human grand_fa1 = new Human("Aleks",true,76);
        Human grand_fa2 = new Human("Boris",true,72);

        grand_fa1.children.add(mother);
        grand_fa2.children.add(father);
        grand_ma1.children.add(mother);
        grand_ma2.children.add(father);

        mother.children.add(kid1);
        mother.children.add(kid2);
        mother.children.add(kid3);

        father.children.add(kid1);
        father.children.add(kid2);
        father.children.add(kid3);

        for (Human h:Arrays.asList(grand_fa1,grand_fa2,grand_ma1,grand_ma2,father,mother,kid1,kid2,kid3)){
            System.out.println(h);
        }

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        //напишите тут ваш код
        public Human(String name,boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age =age;
            this.children = new ArrayList<Human>();

        }
        public Human(String name,boolean sex, int age,ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age =age;
            this.children = new ArrayList<Human>();
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
