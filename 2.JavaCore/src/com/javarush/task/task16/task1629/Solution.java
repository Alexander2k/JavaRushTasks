package com.javarush.task.task16.task1629;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        String line = "";
        @Override
        public void run() {
            try {

                String str = reader.readLine();
                String str1 = reader.readLine();
                String str2 = reader.readLine();
                line+=str+" "+str1+" "+str2;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult(){
            System.out.println(line);
        }
    }
}
