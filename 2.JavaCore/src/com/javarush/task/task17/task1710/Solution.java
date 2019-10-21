package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if (args.length > 0)
        {
           if (args[0].equals("-c")){
               addPeople(args);
           }
           if (args[0].equals("-d"))
           {
               deletePeople(args);
           }
           if (args[0].equals("-i"))
           {
               infoPeople(args);
           }
           if (args[0].equals("-u"))
           {
               updatePeople(args);
           }
        }
    }

    private static void addPeople(String[] args)  {
        String date = args[3];

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        Date d = null;
        try {
            d = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (args[2].equals("м"))
        {
            allPeople.add(Person.createMale(args[1],d));
            System.out.println(allPeople.size()-1);
        }
        else if (args[2].equals("ж"))
        {
            allPeople.add(Person.createFemale(args[1],d));
            System.out.println(allPeople.size()-1);
        }
    }

    private static void updatePeople (String[] args){

        // args[0] - command
        // args[1] - index "id"
        // args[2] - name
        // args[3] - sex
        // args[4] - bdate

        String date = args[4];

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);

        Date d = null;

        try {
            d = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int index = Integer.parseInt(args[1]);

        Sex trueSex;


        Person p = allPeople.get(index);

        if (args[2].equals('м'))
        {
            trueSex=Sex.MALE;
        }else
        {
            trueSex = Sex.FEMALE;
        }


        p.setName(args[2]);
        p.setSex(trueSex);
        p.setBirthDate(d);

        allPeople.set(index,p);

    }

    private static void deletePeople (String[] args) {
        int index = Integer.parseInt(args[1]);

        Person p = allPeople.get(index);

        p.setName(null);
        p.setSex(null);
        p.setBirthDate(null);

        allPeople.set(index,p);

    }

    private static void infoPeople (String[] args){
        Person p = allPeople.get(Integer.parseInt(args[1]));


        String name = p.getName();
        Sex sex = p.getSex();
        Date date = p.getBirthDate();

        String trueSex;
        String trueDate;

        if (sex.equals(Sex.FEMALE)){
            trueSex = "ж";
        }else {
            trueSex = "м";
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        trueDate = simpleDateFormat.format(date);

        System.out.println(name+" "+trueSex+" "+trueDate);
    }
}

