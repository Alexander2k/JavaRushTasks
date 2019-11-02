package com.javarush.task.task19.task1904;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {

       // Scanner scanner = new Scanner(new File("/home/alex/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1904/file"));
       // PersonScannerAdapter adapter = new PersonScannerAdapter(scanner);
       // Person myPerson = adapter.read();
       // System.out.println(myPerson);Д
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner)
        {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String line = fileScanner.nextLine();
            String [] arr = line.split(" ");
            Date date = new SimpleDateFormat("dd M y", Locale.ENGLISH).parse(arr[3]+" "+arr[4]+" "+arr[5]);
            return new Person(arr[1],arr[2],arr[0], date);

        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
