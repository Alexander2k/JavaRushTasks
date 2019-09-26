package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> n_list = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> o_e = new ArrayList<Integer>();

        Scanner reader = new Scanner(System.in);

        for (int i=0;i<20;i++){
            n_list.add(reader.nextInt());
        }

        for (Integer integer : n_list) {
            if((integer % 3==0) && (integer % 2 == 0)){
                odd.add(integer);
                even.add(integer);
            }
            else if (integer % 3==0){
                odd.add(integer);
            }
            else if (integer % 2 == 0){
                even.add(integer);
            }

            else o_e.add(integer);
        }

        printList(odd);
        printList(even);
        printList(o_e);


    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        list.forEach((n)-> System.out.println(n));
    }
}
