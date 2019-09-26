package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //String date = "2013-01-01";
        Scanner reader = new Scanner(System.in);

        String date = reader.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = sdf.parse(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);

        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);



        if (month==1)
        {
            System.out.println("JAN "+day+", "+year);
        }
        else if (month == 2)
        {
            System.out.println("FEB "+day+", "+year);
        }
        else if (month == 3)
        {
            System.out.println("MAR "+day+", "+year);
        }
        else if (month == 4)
        {
            System.out.println("APR "+day+", "+year);
        }
        else if (month == 5)
        {
            System.out.println("MAY "+day+", "+year);
        }
        else if (month == 6)
        {
            System.out.println("JUN "+day+", "+year);
        }
        else if (month == 7)
        {
            System.out.println("JUL "+day+", "+year);
        }
        else if (month == 8)
        {
            System.out.println("AUG "+day+", "+year);
        }
        else if (month == 9)
        {
            System.out.println("SEP "+day+", "+year);
        }
        else if (month == 10)
        {
            System.out.println("OCT "+day+", "+year);
        }
        else if (month == 11)
        {
            System.out.println("NOV "+day+", "+year);
        }
        else if (month == 12)
        {
            System.out.println("DEC "+day+", "+year);
        }

    }
}
