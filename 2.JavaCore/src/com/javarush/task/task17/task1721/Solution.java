package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filename1 = scanner.nextLine();
        String filename2 = scanner.nextLine();

        Solution mySol = new Solution();


        try {
            readData(filename1,allLines);
            readData(filename2,forRemoveLines);
            //System.out.println(allLines);
            //System.out.println(forRemoveLines);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            mySol.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
        //System.out.println(allLines);


    }

    public void joinData() throws CorruptedDataException {


        for (String remove : forRemoveLines)
            if (!allLines.remove(remove)) {
                allLines.clear();
                throw new CorruptedDataException();
            }

    }

    public static void readData(String file,List<String> list) throws IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader buffReader = new BufferedReader(fileReader);

        while (buffReader.ready())
        {

            String line = buffReader.readLine();
            list.add(line);

        }

        fileReader.close();
        buffReader.close();

    }
}
