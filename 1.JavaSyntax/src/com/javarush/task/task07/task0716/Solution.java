package com.javarush.task.task07.task0716;

import javax.swing.*;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мера");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> n_list = new ArrayList<String>();
        for (int i=0; i<strings.size();i++){

            if (strings.get(i).contains("р") && strings.get(i).contains("л")){
                n_list.add(strings.get(i));
            }
            else if (strings.get(i).contains("л")){
                n_list.add(strings.get(i));
                n_list.add(strings.get(i));
            }
            else if (!strings.get(i).contains("л") && !strings.get(i).contains("р")){
                n_list.add(strings.get(i));
            }

        }
        return n_list;
    }
}