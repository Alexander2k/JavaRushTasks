package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();

        if (args.length > 0) {
            if (args[0].equals("-u")) {
                updateProduct(args, file);
            }
            if (args[0].equals("-d"))
            {
                deleteProduct(args,file);
            }
        }

    }

    private static void deleteProduct(String[] args, String file) {

    }

    private static void updateProduct(String[] args, String file) {

    }
}
