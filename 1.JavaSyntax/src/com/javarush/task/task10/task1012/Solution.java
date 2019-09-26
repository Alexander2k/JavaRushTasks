package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        countLeter(list,alphabet);

    }

    public static void countLeter(List<String> list, List<Character> list2){

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < list2.size() ; i++) {
            map.put(list2.get(i),0);
        }


        for (int i = 0; i < list.size(); i++) {
            String stroka = list.get(i);

            for (int j = 0; j < stroka.length() ; j++) {
                char s = stroka.trim().charAt(j);

                if (map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }
                else {
                    map.put(s,1);
                }

            }
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i)+" "+map.get(list2.get(i)));

        }




    }
}
