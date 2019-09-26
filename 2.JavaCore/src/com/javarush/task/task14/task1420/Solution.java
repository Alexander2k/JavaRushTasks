package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        if (num1<= 0) throw new Exception();
        if (num2 <= 0) throw new Exception();

        gcd(num1,num2);


    }


        public static void gcd(int a,int b) {
            while (b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            System.out.println(a);
        }

}
