package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args) {


    }

    public static class MyThread1 extends Thread {

        @Override
        public void run() {
            while (true)
            {

            }

        }
    }

    public static class MyThread2 extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }

        }
    }

    public static class MyThread3 extends Thread {

        @Override
        public void run() {
            while (true)
            {
            try {
                System.out.println("Ура");
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }



        }
    }

    public static class MyThread4 extends Thread implements Message {
        private volatile boolean flag = true;

        @Override
        public void run() {
            while (flag){

            }

        }

        @Override
        public void showWarning() {
            flag = false;


        }
    }

    public static class MyThread5 extends Thread {


        @Override
        public void run() {
            int sum =0;
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                String line = scanner.nextLine();
                if (line.equals("N"))
                {
                    break;
                }
                else {
                sum+=Integer.parseInt(line);
                }
            }
            System.out.println(sum);

        }
    }



}