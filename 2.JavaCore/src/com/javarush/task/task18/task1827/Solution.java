package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();

        if (args.length > 0) {
            if (args[0].equals("-c")) {
                addProduct(args, file);
            }
        }

    }

    private static String nextId(int line) {

        return String.valueOf(line + 1);
    }

    private static void addProduct(String[] args, String file) throws IOException {
        String productName = null;
        String price = null;
        String quantity = null;


        if (args.length > 0) {
            productName = args[1];
            price = args[2];
            quantity = args[3];
        }


        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        int maxId = Integer.MIN_VALUE;


        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();

            String id = line.substring(0, 8).trim();
            if (Integer.parseInt(id) > maxId) {
                maxId = Integer.parseInt(id);
            }
        }

        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        String addLine = String.format("%n%-8s%-30s%-8s%-4s", nextId(maxId), productName, price, quantity);
        bufferedWriter.write(addLine, 0, addLine.length());
        bufferedWriter.close();
    }


}
