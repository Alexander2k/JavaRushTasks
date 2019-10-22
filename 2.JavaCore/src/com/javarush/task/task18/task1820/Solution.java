package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        scanner.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));



            String value = fileReader.readLine();
            String[] vals = value.split(" ");
            fileReader.close();

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
            for (String v : vals) {
                double aDouble = Double.parseDouble(v);
                String str = String.valueOf(Math.round(aDouble));
                fileWriter.write(str+" ");
            }
            fileWriter.close();




    }


}
