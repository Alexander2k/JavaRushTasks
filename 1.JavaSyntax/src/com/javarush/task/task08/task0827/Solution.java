package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 1 2000"));

    }

    public static boolean isDateOdd(String date) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy",Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(date));
        int day = cal.get(Calendar.DAY_OF_YEAR);
        if (day%2 ==0){
            return false;
        }else return true;

    }
}
