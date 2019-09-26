package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFaName = reader.readLine();
        Cat catGrandFa = new Cat(grandFaName,null,null);

        String grandBaname = reader.readLine();
        Cat catGrandBa = new Cat(grandBaname,null,null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrandFa,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null,catGrandBa);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catFather,catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catFather,catMother);

        System.out.println(catGrandFa);
        System.out.println(catGrandBa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);


    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;


        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is "+ father.name;
        }
    }

}
